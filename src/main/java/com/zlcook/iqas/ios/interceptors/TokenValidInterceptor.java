package com.zlcook.iqas.ios.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.exception.TokenInvalidException;
import com.zlcook.iqas.ios.service.TokenService;
import com.zlcook.iqas.ios.vo.BaseStatusVO;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午2:23:30
* Token有效拦截器，该拦截器用于处理用户的请求中的token参数是否有效，有效的话继续执行，无效则返回并给出token无效提示
*/
public class TokenValidInterceptor implements HandlerInterceptor {
	
	private TokenService tokenService;
	
	public TokenValidInterceptor(TokenService tokenService) {
		super();
		this.tokenService = tokenService;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String token = request.getParameter("token");
		if(!tokenService.isVaild(token))
		{
			//返回
			throw new TokenInvalidException("token无效");
		}
		String loginName =tokenService.getLoginNameFromToken(token);
		request.setAttribute("loginName", loginName);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
