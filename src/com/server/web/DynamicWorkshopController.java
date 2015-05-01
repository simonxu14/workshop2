package com.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.bean.DynamicWorkshop;
import com.server.dao.DynamicWorkshopDao;
import com.server.util.Reverse;

@Controller
@RequestMapping("/DynamicWorkshop")
public class DynamicWorkshopController {
	
	@Autowired
	private DynamicWorkshopDao dynamicWorkshopDao;
	
	@RequestMapping(value = "/getDynamicWorkshopHistoryData",method = RequestMethod.GET)
	@ResponseBody
	public String getAll(@RequestParam("workshopID") String workshopID){
		StringBuffer sb = new StringBuffer("");
		sb.append("<html><title>workshopData</title><body>");
		List<DynamicWorkshop> list = dynamicWorkshopDao.queryByWorkshopID(workshopID);
		for(int i = 0;i < list.size();i++){
			Reverse.objectToXML(sb, list.get(i));
		}
		sb.append("</body></html>");
		return sb.toString();
	}
	
	@RequestMapping(value = "/insertDynamicWorkshopData",method = RequestMethod.GET)
	@ResponseBody
	public String insertDynamicWorkshopData(
			@RequestParam("ID")String ID,
			@RequestParam("workshopID")String workshopID,
			@RequestParam("temperature")String temperature,
			@RequestParam("humidity")String humidity,
			@RequestParam("noise")String noise){
		DynamicWorkshop dw = new DynamicWorkshop(ID,workshopID,temperature,humidity,noise);
		if(dynamicWorkshopDao.insert(dw)){
			return "OK";
		}else{
			return "FAIL";
		}
	}
}
