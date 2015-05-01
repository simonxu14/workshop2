package com.server.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
	public static void main(String[] args){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE,50);
		
		System.out.println(calendar.getTime().compareTo(date));
		System.out.println(date.compareTo(calendar.getTime()));
		System.out.println(sdf.format(date).toString());
	}
}
