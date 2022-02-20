package week2;

import java.util.Scanner;

public class Task21DigitCount
/* Enters 2 integer numbers: x and d from console.
   Count and print one number - how many times the digit d occurs
   in the representation of a natural number x. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, d, digit, count;
        x = scanner.nextInt();
        d = scanner.nextInt();
        count = 0;
        while (x != 0) {
            digit = x % 10;
            if (digit == d) {
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);
    }
}
