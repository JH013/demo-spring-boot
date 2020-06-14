package com.example.demo.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description TODO
 * @ClassName FirstFilter
 * @Author wangz
 * @Date 2020/6/14 0014 21:54
 * @Version 1.0
 */
@WebFilter(filterName = "FirstFilter", urlPatterns = "/test1")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("First filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before first filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("After first filter");
    }

    @Override
    public void destroy() {
        System.out.println("First filter destroy");
    }
}
