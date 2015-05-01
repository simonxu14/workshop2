package com.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.server.bean.Worker;
import com.server.dao.WorkerDao;

@Controller
@RequestMapping("/Worker")
public class WorkerController {
	@Autowired
	private WorkerDao workerDao;
	
	@RequestMapping(value = "/addWorker",method = RequestMethod.POST)
	public String add(@ModelAttribute("worker") Worker w) {
		if(workerDao.insert(w)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/showWorker")
	public ModelAndView findAll(){
		List<Worker> results = workerDao.find();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("worker");
		mav.addObject("users",results);
		return mav;
	}
	
	@RequestMapping(value = "/deleteWorker",method = RequestMethod.GET)
	public String delete(@RequestParam("ID") String ID){
		if(workerDao.delete(ID)){
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value = "/findWorker",method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("ID") String ID){
		Worker w = (Worker)workerDao.queryById(ID);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Worker/updateWorker");
		mav.addObject("user",w);
		return mav;
	}
	
	@RequestMapping(value = "/updateWorker",method = RequestMethod.POST)
	public String update(@ModelAttribute("worker") Worker w){
		if(workerDao.update(w)){
			return "success";
		}else{
			return "error";
		}
	}
}
