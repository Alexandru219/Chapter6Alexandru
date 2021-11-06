package com.company;
import java.util.Scanner;

public class Ex619App {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        char b;
        Ex619 sc = new Ex619();
        System.out.printf("Enter the size of square: ");
        a = scan.nextInt();
        //sc.Square(a,'#');
        System.out.printf("Enter the character for square: ");
        b = scan.next().charAt(0);
        sc.Square2(a,b);
    }
}
