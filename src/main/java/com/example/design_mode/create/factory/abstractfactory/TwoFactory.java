package com.example.design_mode.create.factory.abstractfactory;

public class TwoFactory implements Factory {


    @Override
    public CarInterface getCarByFactory() {
        return new BYD();
    }

    @Override
    public AircraftInterface getAircraftByFactory() {
        return new S35();
    }
}
