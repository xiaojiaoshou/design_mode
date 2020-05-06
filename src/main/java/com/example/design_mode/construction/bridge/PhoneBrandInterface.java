package com.example.design_mode.construction.bridge;

/**
 * 手机品牌
 */
public abstract class PhoneBrandInterface {
   protected PhoneColourInterface phoneColourInterface;

    public PhoneBrandInterface(PhoneColourInterface phoneColourInterface) {
        this.phoneColourInterface = phoneColourInterface;
    }

    public abstract void buyPhone();
}
