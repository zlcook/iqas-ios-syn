package com.zlcook.iqas.ios.unitl;
/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午8:32:39
* 负责生成token值，该值在用户登录成功后给用户生成一个唯一的token值，用户之后的每次请求都会携带该token值过来，服务端针对token值进行校验该token值是不是用户最新的，
* 如果不是最新的说明用户在其它设备上已经登录了。
*/
public class TokenUtils {

	/**
	 * 返回token值
	 * @return
	 */
	public static String generatorToken(){
		return System.currentTimeMillis()+"";
	}
	
}
