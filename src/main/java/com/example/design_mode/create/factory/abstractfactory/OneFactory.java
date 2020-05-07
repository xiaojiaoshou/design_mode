package com.example.design_mode.create.factory.abstractfactory;

public class OneFactory implements Factory {


    @Override
    public CarInterface getCarByFactory() {
        return new BMW();
    }

    @Override
    public AircraftInterface getAircraftByFactory() {
        return new S30();
    }
}
