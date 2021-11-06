package com.company;
import java.util.Scanner;

public class Ex626App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Ex626 sc = new Ex626();
        int num;
        System.out.printf("Enter the number: ");
        num = scan.nextInt();
        System.out.printf("The number with digits reversed: "+ sc.rev(num));
    }
}
