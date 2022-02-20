package week2;

import java.util.Scanner;

public class Task11MaxWithTernary
/* Write a java program to find maximum from a given 3 integer numbers
   using ternary operator.Input numbers from console.*/
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max1 = num1 > num2 ? num1 : num2;
        int max = num2 > num3 ? num2: num3;
        System.out.println(max);
    }
}
