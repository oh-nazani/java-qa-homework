package week6practical;

import java.util.Random;
import java.util.Scanner;

public class RandomCheckPractical {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 10;
        int r;
        Random random = new Random();
        r = random.nextInt();
        if (r < 0) {
            r = -r;
        }
        r = r % 9 + 1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != r) {

        }
    }
}
