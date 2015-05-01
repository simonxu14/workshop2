package com.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.server.bean.Machine;
import com.server.bean.Manufacturer;
import com.server.bean.Workshop;
import com.server.dao.MachineDao;

@Controller
@RequestMapping("/Machine")
public class MachineController{
	
	@Autowired
	private MachineDao machineDao;
	
	@RequestMapping(value = "/addMachine",method = RequestMethod.POST)
	public String add(@ModelAttribute("machine") Machine m) {
		if(machineDao.insert(m)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/showMachine")
	public ModelAndView findAll(){
		List<Machine> results = machineDao.find();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Machine/showMachine");
		mav.addObject("users",results);
		return mav;
	}
	
	@RequestMapping(value = "/deleteMachine",method = RequestMethod.GET)
	public String delete(@RequestParam("ID") String ID){
		if(machineDao.delete(ID)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/findMachine",method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("ID") String ID){
		Machine m = (Machine)machineDao.queryById(ID);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Machine/updateMachine");
		mav.addObject("user",m);
		return mav;
	}
	
	@RequestMapping(value = "/updateMachine",method = RequestMethod.POST)
	public String update(@ModelAttribute("machine") Machine m){
		if(machineDao.update(m)){
			return "success";
		}else{
			return "error";
		}
	}
}
