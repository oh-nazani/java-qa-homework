package week6practical;

import java.util.Scanner;

public class ContainsEight {
    public static boolean containsEight(int number){
        while (number > 0){
            if (number/10 == 8){
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int sum = 0;
        while(choice != -1){
            if (containsEight(choice)){
                sum+= choice;
            }
            choice= scanner.nextInt();
        }
        System.out.println(sum);
    }
}
