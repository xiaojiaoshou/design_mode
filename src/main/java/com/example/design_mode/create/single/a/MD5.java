package com.example.design_mode.create.single.a;

public class MD5 {

    private static MD5 md5 = new MD5();

    private MD5() {

    }

    public static MD5 getMD5() {
        return md5;
    }
}
