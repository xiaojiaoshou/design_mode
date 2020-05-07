package com.example.design_mode.create.factory.simple;

public class CarFactory {


    public static CarInterface getCarByFactory(Class<? extends CarInterface> c) {
        if (c.getName() == BMW.class.getName()) {
            return new BMW();
        } else if (c.getName() == BYD.class.getName()) {
            return new BYD();
        } else {
            return null;
        }

    }
}
