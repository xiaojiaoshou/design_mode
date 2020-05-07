package com.example.design_mode.create.single;

public class ASC3 {

    private static volatile ASC3 asc;

    private ASC3() {
    }


    /**
     * volatile 解决重排序问题,解决了双 checked 的空指针问题,同样该模式性能不是很理想
     *
     * @return
     */
    public static ASC3 getInstance() {
        if (asc == null) {
            synchronized (ASC3.class) {
                if (asc == null) {
                    return new ASC3();
                }
            }
        }
        return ASC3.asc;
    }
}
