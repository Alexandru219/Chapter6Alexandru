package com.company;
import java.util.Scanner;

public class Ex630 {
    public static void main(String[] args) {
        int num;
        num = (int) (Math.random() * 999 + 1);
        Scanner input = new Scanner(System.in);
        int x;
       // System.out.print(num);
        do {
            System.out.print("Enter a guess from 1 to 1000): ");
            x = input.nextInt();

            if (x == num) {
                System.out.println("Congratulations. You guessed the number!");
                System.out.println("The secret number is "+num);
            }
            else if (x < num)
                System.out.println("Too low. Try again");
            else if (x > num)
                System.out.println("Too high. Try again");
        } while (x != num);
    }
}

