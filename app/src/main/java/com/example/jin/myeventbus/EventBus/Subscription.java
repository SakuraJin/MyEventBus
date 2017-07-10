package com.example.jin.myeventbus.EventBus;

import java.lang.reflect.Method;

/**
 * 自定义 EventBus 订阅者类
 * Created by Jin on 2017/7/5.
 */

public class Subscription {

    public int mode;
    public Method method;
    public Object subscriber;

    public Subscription(Method method, Object subscriber, int mode) {
        this.method = method;
        this.subscriber = subscriber;
        this.mode = mode;
    }

}
