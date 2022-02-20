package week2;

import java.util.Scanner;

public class Task23Divisor
/* Given an integer number x. Find the smallest
   natural divisor of x other than 1 (2 <= x <= 30000).
        Example`
        Input` 6 Output` 2 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short x = scanner.nextShort();
        //if ((x >= 2) && (x <= 30_000)) {
        for (int i = 2; i < 7; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
        // }
    }
}
