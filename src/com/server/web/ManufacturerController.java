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
import com.server.bean.Worker;
import com.server.dao.ManufacturerDao;;

@Controller
@RequestMapping("/Manufacturer")
public class ManufacturerController {

	@Autowired
	private ManufacturerDao manufacturerDao;
	
	@RequestMapping(value = "/addManufacturer",method = RequestMethod.POST)
	public String add(@ModelAttribute("manufacturer") Manufacturer m) {
		if(manufacturerDao.insert(m)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/showManufacturer")
	public ModelAndView findAll(){
		List<Manufacturer> results = manufacturerDao.find();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Manufacturer/showManufacturer");
		mav.addObject("users",results);
		return mav;
	}
	
	@RequestMapping(value = "/deleteManufacturer",method = RequestMethod.GET)
	public String delete(@RequestParam("ID") String ID){
		if(manufacturerDao.delete(ID)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/findManufacturer",method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("ID") String ID){
		Manufacturer m = (Manufacturer)manufacturerDao.queryById(ID);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Manufacturer/updateManufacturer");
		mav.addObject("user",m);
		return mav;
	}
	
	@RequestMapping(value = "/updateManufacturer",method = RequestMethod.POST)
	public String update(@ModelAttribute("manufacturer") Manufacturer m){
		if(manufacturerDao.update(m)){
			return "success";
		}else{
			return "error";
		}
	}
}
