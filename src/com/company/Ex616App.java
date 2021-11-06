package com.company;
import java.util.Scanner;

public class Ex616App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ex616 sc = new Ex616();
        int a;
        int b;
        int nr;
        System.out.printf("Enter number of pairs of integer numbers: ");
        nr = scan.nextInt();
        for (int i = 1; i <= nr; i++) {
            System.out.printf("Enter number 1: ");
            a = scan.nextInt();
            System.out.printf("Enter number 2: ");
            b = scan.nextInt();
            System.out.printf("");
            if(sc.mult(a,b)==true)
            {
                System.out.println(b+" is multiple of "+a);
            }
            else
            {
                System.out.println(b+" is not multiple of "+a);
            }
        }
    }
}