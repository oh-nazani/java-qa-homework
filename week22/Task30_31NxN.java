package week2;

import java.util.Scanner;

public class Task30_31NxN
/* Write a Java program by using two for loops to produce the output shown below:
   1.Input N natural number, print picture like below in size N*N

   ***********
   ***********
   ***********
   *********** */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < N; j++){
                System.out.print(" *");
            }
        }
    }
}
