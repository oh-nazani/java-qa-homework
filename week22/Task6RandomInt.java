package week2;

import java.util.Random;

public class Task6RandomInt
// Generate and print random integer number between 2 to 7(not using bound)
{
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 7;
        int i;
        Random random = new Random();
        i = random.nextInt();
        if (i < 0) {
            i = -i;
        }
        i = i % 5 + 2;
        System.out.println(i);
    }
}