package week2;

import java.util.Scanner;

public class Task24DivisorsAscending
/* Given an integer number x. Print all natural divisors of the number x
  in ascending order (including 1 and the number itself).
  Example` Input ` 32 Output ` 1 2 4 8 16 32 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }
}
