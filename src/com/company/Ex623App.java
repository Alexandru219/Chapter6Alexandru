package com.company;
import java.util.Scanner;

public class Ex623App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Ex623 sc = new Ex623();
        double a;
        double b;
        double c;
        System.out.printf("Enter a: ");
        a = scan.nextDouble();
        System.out.printf("Enter b: ");
        b = scan.nextDouble();
        System.out.printf("Enter c: ");
        c = scan.nextDouble();
        System.out.printf("Minimum number is: "+ sc.min(a,b,c));

    }
}
