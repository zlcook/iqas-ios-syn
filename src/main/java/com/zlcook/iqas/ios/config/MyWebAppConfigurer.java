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
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

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
     * 增加参数类型转换器失败
     */
  /*  @PostConstruct
    public void initEditableValidation() {
    
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter
            .getWebBindingInitializer();
        if (initializer.getConversionService() != null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer
                .getConversionService();
            genericConversionService.addConverter(new JSON2SynMetaFormConverter());
        }
     
    }*/

	public TokenService getTokenService() {
		return tokenService;
	}
	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}

}
