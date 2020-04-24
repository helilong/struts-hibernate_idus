package com.xiaohe.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test_log4j {
	 static Logger logger = Logger.getLogger(Test_log4j.class);
	    public static void main(String[] args) throws InterruptedException {
	        PropertyConfigurator.configure("E:\\\\zhuomian\\\\S3\\\\Struts2与Hibernate框架应用开发\\\\张康\\\\代码\\\\struts_zy\\\\src\\\\log4j.xml");
	        for (int i = 0; i < 5000; i++) {
	            logger.trace("跟踪信息");
	            logger.debug("调试信息");
	            logger.info("输出信息");
	            logger.warn("警告信息");
	            logger.error("错误信息");
	            logger.fatal("致命信息");
	        }
	    }
}
