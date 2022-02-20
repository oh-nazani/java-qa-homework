package week2;

import java.util.Scanner;

public class Task20
/* Integers a and b are entered. It is guaranteed that a does not exceed b.
   Print all numbers on the segment from a to b that are exact squares.
   If there are no such numbers, then you do not need to display anything.
   Example`
   Input` 2 8
   Output`4 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                if (j * j == i) {
                    System.out.println(i);
                }
            }
        }
    }
}
