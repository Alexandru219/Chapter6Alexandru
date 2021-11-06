package com.company;
import java.util.Scanner;

public class Ex622App {
    public static void main(String[] args){
        double c;
        double f;
        Scanner scan = new Scanner(System.in);
        Ex622 sc = new Ex622();
        System.out.printf("Enter a Fahrenheit temperature for display the Celsius temperature: ");
        f = scan.nextDouble();
        System.out.println("The Celsius temperature is: " + sc.celsius(f));
        System.out.printf("Enter a Celsius temperature for display the Fahrenheit temperature: ");
        c = scan.nextDouble();
        System.out.printf("The Fahrenheit temperature is: "+ sc.fahrenheit(c));

    }
}
