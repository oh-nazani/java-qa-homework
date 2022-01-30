package week3arrays;

import java.util.Scanner;

public class Task3ArrPositive
/* Find the number of positive elements in the given array.
   Example` Input` 1 -1 2 3 -8
            Output 1 2 3 */
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
