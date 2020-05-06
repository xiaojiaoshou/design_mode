package com.example.design_mode.construction.adapter.a;

public class TypeCVga extends Phone implements VgaInterface {


    @Override
    public void convertTypecToVga() {
          super.typeC();
          System.out.println("信息从 TypeC转换为Vga");
    }
}
