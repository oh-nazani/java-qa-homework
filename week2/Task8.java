package week2;

import java.util.Scanner;

public class Task8
/* Input int values a and b from console. If one of them is multiple of 7,
   and both positive, and a greater than b, print all odd values between them
   else print all even values between them. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a % 7 == 0) || (b % 7 == 0) && ((a >= 0) && (b >= 0)) && a > b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}