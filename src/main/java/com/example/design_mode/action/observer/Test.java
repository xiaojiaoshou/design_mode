package com.example.design_mode.action.observer;

public class Test {

    public static void main(String[] args) {
        ObServer userObserver = new UserObserver();
        ObServer workObserver = new WorkObserver();
        WechatServer wechatServer = new WechatServer();
        wechatServer.registerObserver(userObserver);
        wechatServer.registerObserver(workObserver);

        wechatServer.setMessage("你好");
    }
}
