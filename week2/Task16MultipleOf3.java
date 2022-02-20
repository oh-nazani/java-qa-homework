package week2;

import java.util.Scanner;

public class Task16MultipleOf3
/* Print all integer numbers from 1 to N,
   except that are multiple of 3(Input N from console)*/

{
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++){
            if (i % 3 == 0) {
            continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
