package com.company;

public class Ex626 {
    public static int rev(int num){
        int r = 0;
        int t;
        while (num > 0) {
            t = num % 10;
            num = num / 10;
            r = r * 10 + t;
        }
            return r;
    }
}
