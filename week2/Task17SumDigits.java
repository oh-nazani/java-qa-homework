package week2;

import java.util.Scanner;

public class Task17SumDigits
// Write a Java Program to Compute the Sum of Digits in a given Integer.
{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int digit;
        while(num != 0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
