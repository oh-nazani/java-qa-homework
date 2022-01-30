package week3arrays;

import java.util.Scanner;

public class Task8ArrMinMaxSwap
/* In the list, all items are different. Swap the minimum and maximum elements of this list.
   Example` Input`  3 2 1 4 5
            Output` 3 2 5 4 1 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;
        for (i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        arr[maxIndex] = arr[maxIndex] + arr[minIndex];
        arr[minIndex] = arr[maxIndex] - arr[minIndex];
        arr[maxIndex] = arr[maxIndex] - arr[minIndex];

        for(i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
