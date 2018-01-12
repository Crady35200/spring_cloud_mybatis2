package com.crady.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
   2017年12月19日 上午9:18:49
   author: crady
   description:
**/
public class RequestInterceptor implements HandlerInterceptor{
	
	private static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);
	private String requestStr;
	private long start;
	

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception arg3)
			throws Exception {
		logger.info("耗时:[" + (System.currentTimeMillis() - start) + "ms]," + requestStr);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String url = request.getRequestURL().toString();
		String method = request.getMethod();
		String uri = request.getRequestURI();
		String queryString = request.getQueryString();
		System.out.println(request.getParameterMap());
		requestStr = String.format("请求参数:{url: %s, method: %s, uri: %s, params: %s}", url, method, uri, queryString);
		start = System.currentTimeMillis();
		return true;
	}

}
