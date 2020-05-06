package com.example.design_mode.construction.bridge;

public class ReadPhoneColourImpl implements PhoneColourInterface {

    @Override
    public String getColor() {
       return "红色";
    }
}
