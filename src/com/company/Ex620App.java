package com.company;
import java.util.Scanner;

public class Ex620App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double r;
        //double pi=3.14;
        double aria;
        Ex620 sc = new Ex620();
        System.out.printf("Enter the radius of circle: ");
        r = scan.nextDouble();
        aria=sc.circleArea(r);
        System.out.printf("Area = " + aria);
    }
}
