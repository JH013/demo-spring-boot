package com.example.demo.listener.application;

import org.springframework.context.ApplicationEvent;

/**
 * @Description TODO
 * @ClassName SpringEvent
 * @Author wangz
 * @Date 2020/6/15 0015 23:10
 * @Version 1.0
 */
public class SpringEvent extends ApplicationEvent {
    public SpringEvent(Object source) {
        super(source);
    }
}
