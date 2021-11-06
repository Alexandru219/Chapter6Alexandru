package com.company;
import java.util.Scanner;

public class Ex631 {
    public static void main(String[] args) {
        int num;
        num = (int) (Math.random() * 999 + 1);
        Scanner input = new Scanner(System.in);
        int att = 0;
        int x;
        do {
            System.out.print("Enter a guess from 1 to 1000): ");
            x = input.nextInt();
            if (x != num) {
                att++;
                if (x < num)
                    System.out.println("Too low. Try again");
                else if (x > num)
                    System.out.println("Too high. Try again");
            }
            if (x == num) {
                System.out.println("Congratulations. You guessed the number!");
                System.out.println("The secret number is "+num);
                if (att == 10)
                    System.out.println("You know the secret!");
                else if (att> 10)
                System.out.println("You should be able to do better!");
                else if (att < 10)
                    System.out.println("Either you know the secret!");
            }
            if (x != num) {att++;
            }
        }
        while (x != num) ;
    }
}
