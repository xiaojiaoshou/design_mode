package com.example.design_mode.create.factory.simple;

public class Test {

    public static void main(String[] args) {
        CarInterface car = CarFactory.getCarByFactory(BMW.class);
        car.makeCar();

        car = CarFactory.getCarByFactory(BYD.class);
        car.makeCar();

    }
}
