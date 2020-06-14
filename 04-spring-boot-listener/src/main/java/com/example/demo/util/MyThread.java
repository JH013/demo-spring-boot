package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @ClassName MyThread
 * @Author wangz
 * @Date 2020/6/15 0015 2:18
 * @Version 1.0
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                Date date = new Date(System.currentTimeMillis());
                System.out.println(formatter.format(date));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
