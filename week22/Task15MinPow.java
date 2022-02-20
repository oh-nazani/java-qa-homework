package week2;

import java.util.Scanner;

public class Task15MinPow
/* For a given natural N print the smallest integer k that`
     Math.pow(2,k) ≥ N.(You can not use Math.pow())
     Example` Input  7
              Output 3 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = 0;
        while (N != 0) {
            N /= 2;
            k++;
        }
        System.out.println(k);
    }
}
