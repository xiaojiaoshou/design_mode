package com.example.design_mode.create.factory.abstractfactory;

/**
 * 苏30战斗机
 */
public class S30 implements AircraftInterface {

    @Override
    public void makeAircraft() {
        System.out.println("制造一架苏30战斗机!");
    }
}
