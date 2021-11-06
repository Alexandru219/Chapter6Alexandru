package com.company;
import java.util.Scanner;

public class Ex618App {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        char b;
        Ex618 sc = new Ex618();
        System.out.printf("Enter the size of square: ");
        a = scan.nextInt();
        sc.Square(a,'*');

    }
}
