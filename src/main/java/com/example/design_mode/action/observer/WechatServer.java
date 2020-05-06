package com.example.design_mode.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 */
public class WechatServer implements Observerable {

    private List<ObServer> obServerList = new ArrayList<>();

    private String message;

    @Override
    public void registerObserver(ObServer obServer) {
        obServerList.add(obServer);
    }

    @Override
    public void RemoveObserver(ObServer obServer) {
        if (!obServerList.isEmpty()) {
            obServerList.remove(obServer);
        }

    }

    @Override
    public void notifyObServer() {
        obServerList.forEach(o -> o.update(message));
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("消息发生变更message:" + message);
        notifyObServer();
    }
}
