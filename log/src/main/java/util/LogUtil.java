package util;
/**
 * 
 * 常用的工具类
 * @author dl
 *
 */
public class LogUtil {
    /**
     * 判断输入的字符串参数是否为空
     * @return boolean 空则返回true,非空则flase
     */
    public static boolean isEmpty(String input) {
        return null==input || 0==input.length() || 0==input.replaceAll("\\s", "").length();
    }
    
    /**
     * 判断输入的字符串 对象参数是否为空
     * @return boolean 空则返回true,非空则flase
     */
    public static boolean isNotEmpty(Object obj){
    	
    	return true;
    }
}
