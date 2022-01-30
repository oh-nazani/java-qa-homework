package week4method;

/*  Write a function static boolean isPrime(int n), where n != 1 and n < 20000000,
    which return true if n is prime else false. */

import java.util.Scanner;

public class Task2BoolPrime
{
    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
}
