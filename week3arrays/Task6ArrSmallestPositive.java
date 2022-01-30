package week3arrays;

import java.util.Scanner;

public class Task6ArrSmallestPositive
/* Print the value of the smallest of all positive elements in the list.
   It is known that the list contains at least one positive element,
   and the absolute value of all elements of the list does not exceed 1000.
   Example ` Input`  5 -4 3 -2 1
             Output` 1 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        short[] arr = new short[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextShort();
        }
        short min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] >= 0) && (arr[i] < min));
            min = arr[i];
        }
        System.out.println(min);
    }
}