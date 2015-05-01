package com.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.bean.ActiveMachine;
import com.server.dao.ActiveMachineDao;
import com.server.util.Reverse;

@Controller
@RequestMapping("/ActiveMachine")
public class ActiveMachineController {
	
	@Autowired
	private ActiveMachineDao activeMachineDao;
	
	@RequestMapping(value = "/getActiveMachineHistoryData",method = RequestMethod.GET)
	@ResponseBody
	public String getAll(
			@RequestParam("machineID") String machineID,
			@RequestParam("timeRequest") String timeRequest,
			@RequestParam(value = "time_space",required = false) String time_space){
		StringBuffer sb = new StringBuffer("");
		sb.append("<html><title>ActiveMachineData</title><body>");
		if(time_space == null){
			List<ActiveMachine> list = activeMachineDao.queryByMachineID(machineID);
			for(int i = 0;i < list.size();i++){
				Reverse.objectToXML(sb, list.get(i));
			}
		}else{
			List<ActiveMachine> list = activeMachineDao.gatherDataByTimeSpace(machineID, timeRequest, time_space);
			for(int i = 0;i < list.size();i++){
				Reverse.objectToXML(sb, list.get(i));
			}
		}
		sb.append("</body></html>");
		return sb.toString();
	}
	
	@RequestMapping(value = "/insertActiveMachineData",method = RequestMethod.GET)
	@ResponseBody
	public String insertActiveMachineData(
			@RequestParam("ID")String ID,
			@RequestParam("time")String time,
			@RequestParam("moveTime")String moveTime,
			@RequestParam("restTime")String restTime,
			@RequestParam("displacement")String displacement,
			@RequestParam("sTime")String sTime,
			@RequestParam("machine")String machineID){
		ActiveMachine am = new ActiveMachine(ID,time,moveTime,restTime,displacement,sTime,machineID);
		if(activeMachineDao.insert(am)){
			return "OK";
		}else{
			return "FAIL";
		}
	}
}
