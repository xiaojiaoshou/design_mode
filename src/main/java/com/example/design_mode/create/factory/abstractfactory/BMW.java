package com.example.design_mode.create.factory.abstractfactory;

public class BMW implements CarInterface {


    @Override
    public void makeCar() {
        System.out.println("制造宝马汽车!");
    }
}
