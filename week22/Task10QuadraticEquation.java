package week2;

import java.util.Scanner;

public class Task10QuadraticEquation
/* Given 3 real numbers a , b , c .FInd all decisions for
   ax2 + bx + c = 0.Print all decisions, if there is not a decision, print “Can't be” */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The quadratic equation has two solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0){
            double x = -b / (2 * a);
            System.out.println("The quadratic equation has one solution:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Can't be.");
        }
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Can't be.");
        }
    }
}