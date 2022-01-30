package week3arrays;

import java.util.Scanner;

public class Task4ArrPrev
/* A list of numbers is given. Print all the elements of the list
   that are larger than the previous element.
   Example` Input ` 1 5 2 4 3
            Output` 5 4 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j - 1] < arr[j]) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
