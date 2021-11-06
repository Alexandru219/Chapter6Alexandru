package com.company;
import java.util.Scanner;

public class Ex615App {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Ex615 calculate = new Ex615();
        double side1;
        double side2;
        double side3;

        System.out.print("Enter side 1 for the first right triangle: ");
        side1 = scan.nextDouble();
        System.out.print("Enter side 2 for the first right triangle: ");
        side2 = scan.nextDouble();
        side3=calculate.calc(side1, side2);
        System.out.println("Hypotenuse of a first right triangle is "+ side3);
        System.out.println("/////////////////////////////////////////////////");
        System.out.printf("");
        for(int i = 1; i<3;i++)
        {
            System.out.print("Enter side 1 for the first right triangle: ");
            side1 = scan.nextDouble();
            System.out.print("Enter side 2 for the first right triangle: ");
            side2 = scan.nextDouble();
            side3=calculate.calc(side1, side2);
            System.out.println("Hypotenuse of a "+i +" right triangle is "+ side3);

        }
    }
}
