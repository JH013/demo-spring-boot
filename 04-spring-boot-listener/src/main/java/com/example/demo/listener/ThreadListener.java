package com.example.demo.listener;

import com.example.demo.util.MyThread;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description TODO
 * @ClassName ThreadListener
 * @Author wangz
 * @Date 2020/6/15 0015 1:55
 * @Version 1.0
 */
@WebListener
public class ThreadListener implements ServletContextListener {

    private final Thread thread = new Thread(new MyThread());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Thread listener init");
        thread.start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Thread listener destroy");
        thread.stop();
    }
}