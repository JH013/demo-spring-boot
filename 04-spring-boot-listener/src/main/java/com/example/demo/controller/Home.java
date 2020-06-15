package com.example.demo.controller;

import com.example.demo.listener.application.SpringEvent;
import com.example.demo.util.MyCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName Home
 * @Author wangz
 * @Date 2020/6/15 0015 0:04
 * @Version 1.0
 */
@RestController
public class Home {

    @Autowired
    private WebApplicationContext webApplicationConnect;

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/app")
    public Map<String, Object> app() {
        Map<String, Object> map = new HashMap<>();
        ServletContext context = webApplicationConnect.getServletContext();
        Enumeration<String> attributeNames = context.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            if (attributeName.startsWith("app-")) {
                map.put(attributeName, context.getAttribute(attributeName));
            }
        }

        MyCounter.increment();
        return map;
    }

    @RequestMapping("springevent")
    public String springEvent(String msg) {
        applicationContext.publishEvent(new SpringEvent(msg));
        return msg;
    }
}
