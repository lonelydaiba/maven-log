package bean;

import java.io.Serializable;

/**
 * log bean
 * @author dl
 *
 */
public class LogBean implements Serializable{
	private static final long serialVersionUID = -2066575229762487793L;
	private String uuid;//uuid 64位
	private String operator;//操作人
	private String writetime;//填写时间
	private String organ;//部门
	private String ip;//电脑ip
	private String digest;//日志摘要
	private String param;//扩展字段
	private String logtype;//日志类型 
	
	public String getLogtype() {
		return logtype;
	}
	public void setLogtype(String logtype) {
		this.logtype = logtype;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public void setWritetime(String writetime) {
		this.writetime = writetime;
	}
	public void setOrgan(String organ) {
		this.organ = organ;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getOperator() {
		return operator;
	}
	public String getWritetime() {
		return writetime;
	}
	public String getOrgan() {
		return organ;
	}
	public String getIp() {
		return ip;
	}
}
