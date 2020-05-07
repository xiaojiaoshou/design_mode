package com.example.design_mode.create.single;

public class ASC1 {

    private static ASC1 asc;

    private ASC1() {
    }

    /**
     * 整个加锁,效率低
     *
     * @return
     */
    public static synchronized ASC1 getInstance() {
        if (asc == null) {
            if (asc == null) {
                return new ASC1();
            }

        }
        return asc;
    }
}
