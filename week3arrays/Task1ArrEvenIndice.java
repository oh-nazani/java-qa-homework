package week3arrays;

import java.util.Scanner;

public class Task1ArrEvenIndice
/* Print all elements of the array with even indices (that is, A [0], A [2], A [4]...).
   Input natural integer N, define an array with size N, initialize it.
   Example ` Input`  1 2 3 4 5
             Output` 1 3 5 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
         int[] arr = new int[N];
         for(int i = 0;  i < arr.length; i++){
             arr[i] = scanner.nextInt();
         }
         for(int j = 0;  j < arr.length; j += 2){
             System.out.println(arr[j] + " ");
         }
    }
}