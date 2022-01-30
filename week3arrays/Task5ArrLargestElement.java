package week3arrays;

import java.util.Scanner;

public class Task5ArrLargestElement
/* An array of numbers is given. Print the value of the largest element in the array,
   and then the index of that element in the array. If there are several largest elements,
   print the index of the first of them.
   Example` Input` 1 2 3 2 1
            Output` The largest is 3 index is 2 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("The largest is " + max);
         if (arr[i] == max) {
             System.out.println(", index is " + i + ".");
         }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == max){
                System.out.println(", index is " + i + ".");
                break;
            }
        }
    }
}
