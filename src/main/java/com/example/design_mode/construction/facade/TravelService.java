package com.example.design_mode.construction.facade;

/**
 * 旅行社
 */
public class TravelService {

    private Bus bus;
    private Disney disney;
    private Hotel hotel;
    public TravelService() {
        bus=new Bus();
        disney=new Disney();
        hotel=new Hotel();
    }


    public void travel() {
        bus.takeBus();
        disney.buyTickets();
        hotel.live();
    }

}
