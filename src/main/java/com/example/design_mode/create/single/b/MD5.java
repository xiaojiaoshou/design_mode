package com.example.design_mode.create.single.b;

public class MD5 {

    private static MD5 md5;

    private MD5() {
    }

    public static MD5 getMD5() {
        if (md5 == null) {
            md5 = new MD5();
        }
        return md5;
    }
}
