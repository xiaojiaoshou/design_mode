package com.example.design_mode.construction.bridge;

public class XiaomiPhoneBrandImpl extends PhoneBrandInterface {

    public XiaomiPhoneBrandImpl(PhoneColourInterface phoneColourInterface) {
        super(phoneColourInterface);
    }


    @Override
    public void buyPhone() {
        System.out.println("选择了品牌:" + "小米手机" + "    颜色:" + phoneColourInterface.getColor());
    }
}
