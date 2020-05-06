package com.example.design_mode.construction.bridge;

public class Test {
    public static void main(String[] args) {
        PhoneColourInterface colourInterface=new ReadPhoneColourImpl();
        PhoneBrandInterface  phoneBrandInterface=new HuaWeiPhoneBrandImpl(colourInterface);
        phoneBrandInterface.buyPhone();
    }
}
