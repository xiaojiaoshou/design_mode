package com.example.design_mode.construction.adapter.c;

public class Test {

    public static void main(String[] args) {
        SocketPanelInterface socketPanelInterface = new TwoSocketPanelAdaptee();
        socketPanelInterface.A();

        socketPanelInterface = new ThreeSocketPanelAdaptee();
        socketPanelInterface.B();
    }

}
