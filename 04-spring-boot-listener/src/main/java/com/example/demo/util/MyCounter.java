package com.example.demo.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description TODO
 * @ClassName MyCounter
 * @Author wangz
 * @Date 2020/6/15 0015 0:50
 * @Version 1.0
 */
public class MyCounter {

    private static AtomicInteger counter;

    public static void init(int count) {
        counter = new AtomicInteger(count);
    }

    public static void increment(){
        counter.getAndIncrement();
    }

    public static int getCount(){
        return counter.get();
    }
}
