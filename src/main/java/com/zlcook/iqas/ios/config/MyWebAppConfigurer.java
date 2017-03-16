package com.zlcook.iqas.ios.config;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.zlcook.iqas.ios.converter.JSON2SynMetaFormConverter;
import com.zlcook.iqas.ios.interceptors.TokenValidInterceptor;
import com.zlcook.iqas.ios.service.TokenService;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午2:20:15
* 项目配置类,配置了拦截器，mybatis等
*/
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
	
	@Autowired
    private RequestMappingHandlerAdapter handlerAdapter;
	/**
	 * token服务，负责处理token相关业务
	 */
	@Autowired
	private TokenService tokenService;
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用于排除拦截
		
		//添加token拦截器
        registry.addInterceptor(new TokenValidInterceptor(tokenService)).addPathPatterns("/datasyn/syn/*");
		super.addInterceptors(registry);
	}


	/**
	 * json消息转换器设成fastjson
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	        super.configureMessageConverters(converters);
	      
	        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
	 
	        FastJsonConfig fastJsonConfig = new FastJsonConfig();
	        fastJsonConfig.setSerializerFeatures( SerializerFeature.PrettyFormat );
	        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
	        fastConverter.setFastJsonConfig(fastJsonConfig);
	      
	        converters.add(fastConverter);
	}



	public TokenService getTokenService() {
		return tokenService;
	}
	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}

}
