package com.example.design_mode.construction.bridge;

public class HuaWeiPhoneBrandImpl extends PhoneBrandInterface {

    public HuaWeiPhoneBrandImpl(PhoneColourInterface PhoneBrandInterface) {
        super(PhoneBrandInterface);
    }

    @Override
    public void buyPhone() {
        System.out.println("选择了品牌:"+"小米手机"+"    颜色:"+phoneColourInterface.getColor());
    }
}
