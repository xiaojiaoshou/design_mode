package com.example.design_mode.create.factory.method;

public class BYDFactory implements CarFactory {

    @Override
    public CarInterface getCarByFactory() {
        return new BYD();
    }
}
