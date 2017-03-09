package com.zlcook.iqas.ios.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zlcook.iqas.ios.form.SynMetaJSON;

/**
* @author 周亮 
* @version 创建时间：2017年3月9日 下午12:27:11
* 
*/
public class JSON2SynMetaFormConverter implements Converter<String,SynMetaJSON>{

	@Override
	public SynMetaJSON convert(String source) {
		
		if( source ==null ){
			System.out.println("source is  null");
			return null;
		}
		JSONObject json =JSONObject.parseObject(source);
		System.out.println("source:"+source);
		SynMetaJSON form =  JSON.parseObject(source, SynMetaJSON.class);
		
		return form;
	}

}
