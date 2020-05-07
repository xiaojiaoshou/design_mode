package com.example.design_mode.create.single;

public class ASC4 {

    private static ASC4 instance;

    private ASC4() {
    }


    /**
     * 静态内部类
     *
     * @return
     */
    public static ASC4 getInstance() {
        if (instance == null) {
            return InstanceHolder.instance;
        }
        return instance;
    }

    private static class InstanceHolder {
        private final static ASC4 instance = new ASC4();
    }

}
