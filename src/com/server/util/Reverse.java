package com.server.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.server.bean.ActiveMachine;
import com.server.bean.DynamicWorkshop;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Reverse {
	
	/**
	 * ת����XML�ַ���
	 * @param sb
	 * @param object
	 */
	public static void objectToXML(StringBuffer sb,Object o){
		XStream xstream = new XStream(new DomDriver());
		xstream.processAnnotations(DynamicWorkshop.class);
		xstream.processAnnotations(ActiveMachine.class);
		if(o.getClass() == DynamicWorkshop.class){
			DynamicWorkshop dw = (DynamicWorkshop) o;
			sb.append(xstream.toXML(dw));
		}
		if(o.getClass() == ActiveMachine.class){
			ActiveMachine am = (ActiveMachine) o;
			sb.append(xstream.toXML(am));
		}
	}
	
	/**
	 * ��ʱ���ַ���ת���ɱ�׼ʱ������
	 * @param dateString
	 * @return
	 */
	public static Date StringToDate(String dateString){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * ��ʱ������ת����ʱ���ַ�������
	 * @param time
	 * @return
	 */
	public static String DateToString(Date time){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(time);
	}
}
