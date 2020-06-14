package com.example.demo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Description TODO
 * @ClassName SecondFIlter
 * @Author wangz
 * @Date 2020/6/14 0014 22:21
 * @Version 1.0
 */
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Second filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before second filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("After second filter");
    }

    @Override
    public void destroy() {
        System.out.println("Second filter destroy");
    }
}
