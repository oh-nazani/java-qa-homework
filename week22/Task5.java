package week2;

import java.util.Scanner;

public class Task5
/* Write a Java program to allow the user to input his/her age.
   Then the program will show if the person is eligible to vote.
   A person who is eligible to vote must be older than or equal to 18 years old. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        byte age = scanner.nextByte();
        if (age >= 18) {
            System.out.println("You're eligible to vote!");
        } else {
            System.out.println("Congrats! You aren't eligible to vote, so you can spend your time more productively.");
        }
    }
}
