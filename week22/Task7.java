package week2;

import java.util.Scanner;

public class Task7
/* Input from console int a and int b, if a and b corresponds
   for following requirements print “Both a and b legal”, if any of them
   does not correspond print about it like this “a is legal b is illegal ''. or vice versa */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // a > 10 and b is not equal to 10
        if ((a > 10) && (b != 10)) {
            System.out.println("1. Both a and b are legal.");
        } else if ((a <= 10) && (b == 10)) {
            System.out.println("1. Both a and b are illegal.");
        } else if ((a > 10) && (b == 10)) {
            System.out.println("1. a is legal, b is illegal.");
        } else {
            System.out.println("1. a is illegal, b is legal.");
        }

        // both a and b is positive
        if ((a >= 0) && (b >= 0)) {
            System.out.println("2. Both a and b are legal.");
        } else if ((a >= 0) && (b < 0)) {
            System.out.println("2. a is legal, b is illegal.");
        } else if ((a < 0) && (b >= 0)) {
            System.out.println("2. a is illegal, b is legal.");
        } else {
            System.out.println("2. Both a and b are illegal.");
        }
        // both a and b is negative
        // a > 10 b < 1 both of them are odd
        // a is a multiple of 5 OR b is a multiple of 5
        // a is not a multiple of 5 but b is a multiple of 5
    }
}
// Շարունակելի․․․

