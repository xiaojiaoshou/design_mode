package com.example.design_mode.construction.decorate;

public class Test {


    public static void main(String[] args) {
        ClothesImpl decoratorClothes=new DecoratorClothes();
        decoratorClothes.makeClothes();
    }
}
