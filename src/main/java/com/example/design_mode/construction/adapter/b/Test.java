package com.example.design_mode.construction.adapter.b;

public class Test {

    public static void main(String[] args) {
        VgaInterface typeCVga = new TypeCVga(new Phone());
        typeCVga.convertTypecToVga();
    }


}
