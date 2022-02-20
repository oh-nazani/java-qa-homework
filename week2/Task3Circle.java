package week2;

import java.util.Scanner;

public class Task3Circle
// Compute area and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        double PI = 3.14159;
        double area;
        double perimeter;
        area = PI * R * R;
        System.out.println("Circle area = " + area);
        perimeter = 2 * PI * R * R;
        System.out.println("Circle perimeter = " + perimeter);
    }
}