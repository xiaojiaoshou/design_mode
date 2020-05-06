package com.example.design_mode.action.observer;

public class UserObserver implements ObServer {

    @Override
    public void update(String message) {
        System.out.println("userObServer接收到推送消息message=" + message);
    }
}
