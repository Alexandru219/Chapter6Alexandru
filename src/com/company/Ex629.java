package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ex629 {
    private static final Random randomF = new Random();
    private enum Coin{h, t};
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] flips = new int[2];
        int count = 0;

        while(true){
            System.out.println("Press 1 to Toss Coin");
            System.out.println("Press 2 to exit");
            System.out.printf("Toss Coin: ");
            if(scan.nextInt() == 2)
                break;
            switch(flip()){
                case h:
                    flips[0] += 1;
                    break;
                case t:
                    flips[1] += 1;
                    break;
                default:
                    break;
            }
            count++;
        }

        System.out.println("\nNumber of throws: "+ count);
        System.out.println("HEADS: "+ flips[0]);
        System.out.println("TAILS: "+ flips[1]);
    }
    public static Coin flip(){
        return (randomF.nextInt(2) == 0) ? Coin.h : Coin.t;
    }
}
