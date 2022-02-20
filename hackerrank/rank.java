package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class rank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        try {
            if ((x < -2147483648 && x > 2147483647) ||
            (y < -2147483648 && y > 2147483647)){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

