package week2;

import java.util.Scanner;

public class Task26Sum
// Calculate the sum of the given 10 natural numbers. Input integers from console
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        int sum = 0;
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            numbers = scanner.nextInt();
            if (i > 0) {
                sum += numbers;
                }
            }
        System.out.println(sum);
        }
}
