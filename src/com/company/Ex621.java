package com.company;

public class Ex621 {
    public static int sepqt(int a, int b){
        return a/b;
    }
    public static int seprem(int a, int b)
    {
        return a % b;
    }
    public static int displaydigits(int x) {
        int[] array = new int[String.valueOf(x).length()];
        if(x>99999) {
            System.out.printf("Error!!!");
            return 0;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = seprem(x, 10);
            x = sepqt(x, 10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d  ", array[i]);
        }
        System.out.println();
        return x;
    }

}