package com.example.demo.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description 应用初始化监听器
 * @ClassName FirstListener
 * @Author wangz
 * @Date 2020/6/14 0014 23:07
 * @Version 1.0
 */
@WebListener
public class AppInitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("AppInit listener init");
        ServletContext sct = sce.getServletContext();
        sct.setAttribute("app-name", "04-spring-boot-listener");
        sct.setAttribute("app-version", "1.0.0.0");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("AppInit listener destroy");
    }
}
