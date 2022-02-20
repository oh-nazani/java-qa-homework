package week2;

import java.util.Scanner;

public class Task22ReversedNum
/* Given an integer number x. Print the number consisting of the digits
   of the given number x in reverse order. You do not need to output leading zeros. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int lastDigit;
        int reversedX = 0;
        while (x != 0) {
            lastDigit = x % 10;
            reversedX = reversedX * 10 + lastDigit;
            x = x / 10;
        }
        System.out.println(reversedX);
    }
}
