package com.example.design_mode.action.observer;

public class WorkObserver implements ObServer {


    @Override
    public void update(String message) {
        System.out.println("WorkObserver接收到消息推送message=" + message);
    }
}
