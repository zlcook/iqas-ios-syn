package com.zlcook.iqas.ios.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.zlcook.iqas.ios.exception.TokenInvalidException;
import com.zlcook.iqas.ios.service.TokenService;
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
		String token = null;
		//请求内容类型
		String contentType=request.getContentType();
		//发送的是json数据
		if( contentType.contains("application/json")){
			String charEncoding = request.getCharacterEncoding();
			//获取json数据
			int contentLength = request.getContentLength();
			if( contentLength <=0  )
				return false;
			
			byte[] buffer = new byte[contentLength];
			
			int readResult = request.getInputStream().read(buffer);
			if( readResult ==-1)
				return false;
			
			String jsonStr = new String(buffer,charEncoding);
			JSONObject json =JSONObject.parseObject(jsonStr);
			token =(String) json.get("token");
		}else{
			token = request.getParameter("token");
		}
		
		if(!tokenService.isVaild(token))
		{
			//返回
			throw new TokenInvalidException("token无效");
		}
		/*Integer userId =tokenService.getUserIdFromToken(token);
		request.setAttribute("userId", userId);*/
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
