package com.server.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.server.bean.Machine;
import com.server.dao.MachineDao;

public class Test {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"config/applicationContext.xml");
		MachineDao md = (MachineDao) ctx.getBean("machineDao");
		
		Machine m = new Machine();
		m.setID("test");
		m.setType("1");
		m.setmNumber("1");
		m.setsNumber("1");
		m.setWorkshop("test");
		m.setManufacturer("test");
		m.setpDate("2014-5-12 00:43:01");
		m.setWorkerID("test");
		
		System.out.println(md.insert(m));
		System.out.println(md.update(m));
		System.out.println(md.find());
		System.out.println(md.queryById("test"));
		System.out.println(md.delete("test"));
		System.out.println("OK");
		
	}
}
