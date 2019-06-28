package com.example.demo.util;

import com.thoughtworks.xstream.XStream;

public class XsteamUtil {
	public static Object toBean(Class<?> clazz, String xml) {
		Object xmlObject = null;
		XStream xstream = new XStream();
		xstream.processAnnotations(clazz);
		xstream.autodetectAnnotations(true);
		xmlObject = xstream.fromXML(xml);
		return xmlObject;
	}
	
	public static String toXml(Class<?> clazz,Object obj) {
		XStream xstream = new XStream();
		xstream.processAnnotations(clazz);
		xstream.autodetectAnnotations(true);
		String xmlString = xstream.toXML(obj);
		return xmlString;
	}
}
