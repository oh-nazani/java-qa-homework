package week2;

import java.util.Scanner;

public class Task25DivisorsCount
/* Given an integer x. Count the number of natural divisors of x
   (including 1 and the number itself; x ≤ 2 ∗ 109). */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
