package test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogDemo {
	private final static Logger log =LogManager.getLogger(LogDemo.class);
	public static void main(String[] args) {
		//使用默认的配置信息，不需要写log4j.properties
        //设置日志输出级别为info，这将覆盖配置文件中设置的级别
        //log.setLevel(Level.INFO);
		log.debug("hello world!");
		log.warn("hello world!");
		log.info("hello world!!");
		log.error("hello world!");
	}
}
