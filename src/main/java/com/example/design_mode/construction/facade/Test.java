package com.example.design_mode.construction.facade;

/**
 * 场景: 旅行的过程:需要乘坐汽车,到底迪士尼,住酒店.
 */
public class Test {

    public static void main(String[] args) {
        TravelService travelService = new TravelService();
        travelService.travel();
    }
}
