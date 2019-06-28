package com.example.demo.xs.coverters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class DateConverter implements Converter{
	
 
	
	private String dateformatter= "yyyy-MM-dd HH:mm:ss";  
  
    /** 
     * 默认转换格式 
     *  
     * @author jiucool.com 
     */  
    public DateConverter() {  
        super();  
        this.dateformatter = "yyyy-MM-dd HH:mm:ss";  
    }  
  
    public DateConverter(String dateformatter) {  
        super();  
        this.dateformatter = dateformatter;  
    }  

	/**
	 * 判断要转换的类型
	 * */
	@Override
	public boolean canConvert(Class type) {
		// TODO Auto-generated method stub
		return Date.class.isAssignableFrom(type);
	}

	/***
	 * 实现java对象到xml的转换逻辑
	 * */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		// TODO Auto-generated method stub
		DateFormat formate = new SimpleDateFormat(dateformatter);
		writer.setValue(formate.format(source));
	}

	/**
	 * 实现xml到java对象的转化逻辑
	 * */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar();
		DateFormat formate = new SimpleDateFormat(dateformatter);
		try {
			calendar.setTime(formate.parse(reader.getValue()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return calendar.getGregorianChange();
	}

 
	
}
