package impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dao.ILoggerAdapter;
/**
 * 实现接口ILoggerAdapter
 * @author dl
 *
 */
public class LoggerAdapterImpl implements ILoggerAdapter{
	
	private Logger log=null;
	public LoggerAdapterImpl(Class clazz) {
		log=LogManager.getLogger(clazz!=null?clazz.getClass():clazz);
	}
	public void info(String msg) {
		log.info(msg);
	}

	public void info(Throwable ex) {
		log.info(ex.getMessage());
	}

	public void info(String msg, Throwable ex) {
		log.info(msg, ex);
	}

	public void info(String msg, Object... params) {
	}
	

	public void debug(String msg, Throwable ex) {
		
	}

	public void debug(String msg) {
		log.debug(msg);
	}

	public void debug(Throwable ex) {
		log.debug(ex.getMessage());
		
	}

	public void debug(String msg, Object... params) {
		
	}

	public void error(String msg, Throwable ex) {
		
	}

	public void error(String msg) {
		log.error(msg);
	}

	public void error(Throwable ex) {
		log.error(ex.getMessage());
	}

	public void error(String msg, Object... params) {
		
	}

	public void warn(String msg) {
		log.warn(msg);
	}

	public void warn(Throwable ex) {
		log.warn(ex.getMessage());
	}

	public void warn(String msg, Throwable ex) {
		log.warn(msg, ex);
	}

	public void warn(String msg, Object... params) {
		
	}

}
