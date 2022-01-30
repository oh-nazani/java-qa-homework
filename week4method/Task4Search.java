package week4method;

/* Write a method called search(), which takes an array of int and an int;
   and returns the array index if the array contains the given int; or -1 otherwise. */

import java.util.Scanner;

public class Task4Search
{
    static int search(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {4, 5, 13, 99};
        System.out.println(search(array, 13));
    }
}
