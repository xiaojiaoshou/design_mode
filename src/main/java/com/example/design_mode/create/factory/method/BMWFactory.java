package com.example.design_mode.create.factory.method;

public class BMWFactory implements CarFactory {

    @Override
    public CarInterface getCarByFactory() {
        return new BMW();
    }
}
