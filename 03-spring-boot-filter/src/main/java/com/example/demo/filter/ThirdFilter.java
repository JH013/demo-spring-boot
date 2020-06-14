package com.example.demo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Description TODO
 * @ClassName ThirdFilter
 * @Author wangz
 * @Date 2020/6/14 0014 22:41
 * @Version 1.0
 */
public class ThirdFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Third filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before third filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("After third filter");
    }

    @Override
    public void destroy() {
        System.out.println("Third filter destroy");
    }
}
