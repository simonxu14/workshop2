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
import com.server.bean.Worker;
import com.server.bean.Workshop;
import com.server.dao.WorkshopDao;

@Controller
@RequestMapping("/Workshop")
public class WorkshopController {
	
	@Autowired
	private WorkshopDao workshopDao;
	
	@RequestMapping(value = "/addWorkshop",method = RequestMethod.POST)
	public String add(@ModelAttribute("workshop") Workshop w) {
		if(workshopDao.insert(w)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/showWorkshop")
	public ModelAndView findAll(){
		List<Workshop> results = workshopDao.find();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Workshop/showWorkshop");
		mav.addObject("users",results);
		return mav;
	}
	
	@RequestMapping(value = "/deleteWorkshop",method = RequestMethod.GET)
	public String delete(@RequestParam("ID") String ID){
		if(workshopDao.delete(ID)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/findWorkshop",method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("ID") String ID){
		Workshop w = (Workshop)workshopDao.queryById(ID);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Workshop/updateWorkshop");
		mav.addObject("user",w);
		return mav;
	}
	
	@RequestMapping(value = "/updateWorkshop",method = RequestMethod.POST)
	public String update(@ModelAttribute("workshop") Workshop w){
		if(workshopDao.update(w)){
			return "success";
		}else{
			return "error";
		}
		
	}
}
