package com.example.design_mode.create.factory.method;

public class BYD implements CarInterface {


    @Override
    public void makeCar() {
        System.out.println("制造比亚迪汽车!");
    }
}
