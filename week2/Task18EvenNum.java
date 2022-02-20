package week2;

import java.util.Scanner;

public class Task18EvenNum
/* Write a java program to print all even numbers from a given range (a to b).
   Input a and b from console.Example`
   Input ` 2 5 Output ` 2 4 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Try again. There aren't any even numbers in the given range.");
                continue;
            }
        }
    }
}
