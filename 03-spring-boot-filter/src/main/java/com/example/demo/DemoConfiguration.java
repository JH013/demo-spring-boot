package com.example.demo;

import com.example.demo.filter.ThirdFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @ClassName Configuration
 * @Author wangz
 * @Date 2020/6/14 0014 22:42
 * @Version 1.0
 */
@Configuration
public class DemoConfiguration {
    @Bean
    public FilterRegistrationBean<ThirdFilter> RegistFilter() {
        FilterRegistrationBean<ThirdFilter> bean = new FilterRegistrationBean<ThirdFilter>();
        bean.setFilter(new ThirdFilter());
        bean.addUrlPatterns("/test1");
        return bean;
    }
}
