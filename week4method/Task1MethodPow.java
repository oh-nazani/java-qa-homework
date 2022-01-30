package week4method;

public class Task1MethodPow
// Write a function static double(double a, int n) calculating the value of a to the power of n.

{
    static double powerOfA (double a, int n) {
        double powResult = 1;
        while (n != 0) {
            powResult *= a;
            n--;
        }
        return powResult;
    }
    public static void main(String[] args) {
        System.out.println(powerOfA(2.4, 2));
    }
}