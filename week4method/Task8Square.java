package week4method;
// Write a square() method, which
//        if get one int parameter returns the square of circle
//        if get one float parameter returns the square of square
//        if get 2 parameters returns the square of rectangle

public class Task8Square {
    static void square(int r) {
        double PI = 3.14159;
        double circleArea = PI * r * r;
        System.out.println("The area of the circle = " + circleArea);
    }
    static void square(float side) {
        double squareArea = side * side;
        System.out.println("The area of the square = " + squareArea);
    }
    static void square(double side1, double side2) {
        double rectangleArea = side1 * side2;
        System.out.println("The area of the rectangle = " + rectangleArea);
    }
}
