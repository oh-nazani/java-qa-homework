package week3arrays;

import java.util.Scanner;

public class Task2ArrEvenNum
/* Print all even numbered items in the list.
   Input natural integer N, define an array with size N, initialize it.
   Example ` Input` 1 2 3 4 5 10
             Output` 2 4 10 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
