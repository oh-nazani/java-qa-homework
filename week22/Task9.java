package week2;

import java.util.Scanner;

public class Task9

/* Given coordinates of two points in the coordinate plane. Write java program
   to check if the points lie in the same plane?(quarter)
       Print In the same quarter, else print Not in the same quarter.
       Input 4 coordinates from console, all 4 coordinates != 0. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a == 0 || b == 0 || c == 0 || d == 0) {
            System.out.println("Please, enter a valid value.");
        } else {
            if((a > 0 && b > 0 && c > 0 && b > 0) || !(a > 0 && b > 0 && c > 0 && b > 0)) {
                System.out.println("In the same quarter.");
            } else {
                System.out.println("To dooooo.......");
            }
        }
    }
}
// Շարունակելի․․․
