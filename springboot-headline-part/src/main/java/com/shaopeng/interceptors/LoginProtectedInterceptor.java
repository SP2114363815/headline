package com.shaopeng.interceptors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shaopeng.utils.JwtHelper;
import com.shaopeng.utils.Result;
import com.shaopeng.utils.ResultCodeEnum;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

//登录包含拦截器，检查请求头是否包含有效token
//有 有效  放行
//没有或者无效 拦截返回504
@Component
public class LoginProtectedInterceptor implements HandlerInterceptor {
    @Autowired
    private JwtHelper jwtHelper;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从请求头中获取token
        String token = request.getHeader("token");
        //检查是否有效
        boolean expiration = jwtHelper.isExpiration(token);
        //有效放行
        if (!expiration){
            //放行
            return true;
        }
        //无效返回504的状态json
        Result result = Result.build(null, ResultCodeEnum.NOTLOGIN);
        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(result);
        response.getWriter().print(json);
        return false;
    }
}
