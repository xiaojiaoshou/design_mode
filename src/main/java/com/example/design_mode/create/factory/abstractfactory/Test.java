package com.example.design_mode.create.factory.abstractfactory;

public class Test {

    public static void main(String[] args) {
        Factory factory = new OneFactory();
        AircraftInterface aircraftByFactory = factory.getAircraftByFactory();
        aircraftByFactory.makeAircraft();

        CarInterface carByFactory = factory.getCarByFactory();
        carByFactory.makeCar();
    }
}
