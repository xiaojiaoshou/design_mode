package com.example.design_mode.action.observer;

/**
 * 被观察者接口
 */
public interface Observerable {

    void registerObserver(ObServer obServer);

    void RemoveObserver(ObServer obServer);

    void notifyObServer();
}
