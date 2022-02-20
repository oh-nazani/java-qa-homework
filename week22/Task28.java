package week2;

import java.util.Scanner;

public class Task28
 /* Enter the number N, followed by N integers.
    Count how many zeros, positive numbers, negative numbers among the given N numbers.
    It is necessary to print first the number of zeros, then the number of positive and negative numbers. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < N; i++) {
            i = scanner.nextInt();
            if (i == 0) {
                countZero++;
            }
            else  if (i > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
//
//        for (int i = 0; i < N; i++) {
//
//        }
        System.out.println(countZero);
        System.out.println(countPositive);
        System.out.println(countNegative);
    }
}
// ?