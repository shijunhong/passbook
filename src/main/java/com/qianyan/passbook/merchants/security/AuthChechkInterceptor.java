package com.qianyan.passbook.merchants.security;


import com.qianyan.passbook.merchants.constant.Constants;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <h1>权限拦截器</h1>
 * Created by shijunhong
 * */
@Component
public class AuthChechkInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader(Constants.TOKEN_STRING);
        if (StringUtils.isEmpty(token)){
            throw new Exception("Header 中缺少 " + Constants.TOKEN_STRING + "!");
        }
        if (!token.equals(Constants.TOKEN)){
            throw new Exception("Header 中　" + Constants.TOKEN_STRING + "错误!");
        }
        AccessContext.setToken(token);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        AccessContext.clearAccessKey();
    }
}
