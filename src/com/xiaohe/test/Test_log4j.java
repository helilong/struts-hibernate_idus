package com.xiaohe.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test_log4j {
	 static Logger logger = Logger.getLogger(Test_log4j.class);
	    public static void main(String[] args) throws InterruptedException {
	        PropertyConfigurator.configure("E:\\\\zhuomian\\\\S3\\\\Struts2��Hibernate���Ӧ�ÿ���\\\\�ſ�\\\\����\\\\struts_zy\\\\src\\\\log4j.xml");
	        for (int i = 0; i < 5000; i++) {
	            logger.trace("������Ϣ");
	            logger.debug("������Ϣ");
	            logger.info("�����Ϣ");
	            logger.warn("������Ϣ");
	            logger.error("������Ϣ");
	            logger.fatal("������Ϣ");
	        }
	    }
}
