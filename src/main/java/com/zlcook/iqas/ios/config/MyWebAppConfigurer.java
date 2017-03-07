package com.zlcook.iqas.ios.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.zlcook.iqas.ios.interceptors.TokenValidInterceptor;
import com.zlcook.iqas.ios.service.TokenService;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午2:20:15
* 项目配置类,配置了拦截器，mybatis等
*/
@Configuration
@MapperScan("com.zlcook.iqas.ios.mapper")
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
	
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
	
	public TokenService getTokenService() {
		return tokenService;
	}
	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}

}
