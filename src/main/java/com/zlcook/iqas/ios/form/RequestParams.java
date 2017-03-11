package com.zlcook.iqas.ios.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.zlcook.iqas.ios.exception.GlobalExceptionHandler;
import com.zlcook.iqas.ios.exception.JSONDataParseException;
import com.zlcook.iqas.ios.unitl.GenericsUtils;

/**
* @author 周亮 
* @version 创建时间：2017年3月9日 下午2:10:17
* 接收移动端通过key/vale形式发送过来的参数
*/
public class RequestParams<T extends JsonObjectAssert> {
	private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	/**
	 * token值
	 */
	@NotNull
	private String token;
	/**
	 * json数据，json数据的内容要T类中的属性相吻合。
	 * 下面的getObj方法会根据该json数据转换成T的实例对象。
	 */
	@NotBlank(message="json不能为空")
	@NotNull
	private String json;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	/**
	 * 将json数据转换成T对象，如果json数据的格式不满足T类的格式，会抛出JSONDataParseException运行时异常。
	 * @param clazz the class of T
	 * @return
	 * 返回封装的T对象
	 */
	public  T getObjFromJSON(Class<T> clazz){
		try{
			return JSON.parseObject(json,clazz);
		}catch(Exception e){
			
			logger.error("json数据格式或者数据类型有误!",e);
			throw new JSONDataParseException("json数据格式或者数据类型有误!",e);
		}
	}
}
