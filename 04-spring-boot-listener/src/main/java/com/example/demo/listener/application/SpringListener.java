package com.example.demo.listener.application;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @ClassName MyApplicationListener
 * @Author wangz
 * @Date 2020/6/15 0015 23:09
 * @Version 1.0
 */
@Component
public class SpringListener implements ApplicationListener<SpringEvent> {
    @Override
    public void onApplicationEvent(SpringEvent springEvent) {
        System.out.println("Spring listener - " + springEvent.toString());
    }
}
