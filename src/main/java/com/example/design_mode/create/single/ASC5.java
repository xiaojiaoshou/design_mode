package com.example.design_mode.create.single;

public class ASC5 {
    private ASC5() {

    }

    private enum Singleton {
        INSTANCE;

        private final ASC5 instance;

        Singleton() {
            instance = new ASC5();
        }

        public ASC5 getInstance() {
            return instance;
        }
    }

    /**
     * 利用枚举
     * @return
     */
    public static ASC5 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

}
