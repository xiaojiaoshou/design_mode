package com.example.design_mode.construction.adapter.b;

public class TypeCVga implements VgaInterface {

    private Phone phone;

    public TypeCVga(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void convertTypecToVga() {
        phone.typeC();

        System.out.println("信息从 TypeC转换为Vga");
    }
}
