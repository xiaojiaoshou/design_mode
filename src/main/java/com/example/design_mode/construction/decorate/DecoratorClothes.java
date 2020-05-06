package com.example.design_mode.construction.decorate;

public class DecoratorClothes extends ClothesImpl {

    @Override
    public void makeClothes() {
        super.makeClothes();
        addFlower();
    }

    private void addFlower() {
        System.out.println("给制作好的衣服添加花朵完工!");
    }
}
