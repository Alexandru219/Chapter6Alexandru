package com.company;
import java.util.Scanner;

public class Ex617App {
    public static void main(String[] args)
    {
        int a;
        Scanner scan = new Scanner(System.in);
        Ex617 sc = new Ex617();
        System.out.printf("Enter the number: ");
        a = scan.nextInt();

        if(sc.EorO(a))
        {
            System.out.printf("The number "+a+" is even.");
        }
        else
        {
            System.out.printf("The number "+a+" is odd.");
        }
    }
}
