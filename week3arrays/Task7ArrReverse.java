package week3arrays;

import java.util.Scanner;

public class Task7ArrReverse
/* Print the elements of the given list in reverse order without changing the list itself.
        Example` Input`  1 2 3 4 5
                 Output` 5 4 3 2 1 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Reversed array: " );
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
