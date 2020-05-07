package com.example.design_mode.create.single;

public class ASC2 {

    private static ASC2 asc;

    private ASC2() {
    }


    /**
     * 该模式 线程不安全,重排序可能会导致空指针异常
     *
     * @return
     */
    public static ASC2 getInstance() {
        if (asc == null) {
            synchronized (ASC1.class) {
                if (asc == null) {
                    return new ASC2();
                }
            }
        }
        return ASC2.asc;
    }
}
