package com.example.design_mode.create.factory.method;

public class Test {

    public static void main(String[] args) {
        CarInterface carInterface = new BMWFactory().getCarByFactory();
        carInterface.makeCar();

        carInterface = new BYDFactory().getCarByFactory();
        carInterface.makeCar();

    }
}
