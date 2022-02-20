package week2;

import java.util.Scanner;

public class Task14AscendingInt
/* Print all integer powers of two not exceeding N in ascending order.
   Input N from console. Example ` Input 50(You can not use Math.pow())
           Output ` 1 2 4 8 16 32. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i *= 2;
        } while (i <= N);
    }
}
