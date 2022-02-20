package week2;

import java.util.Scanner;

public class Task2Explicit
// Narrowing Primitive Conversion (Explicit)
// Write java program, which has double type variable(Input variable from console)
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cast double to float,print both variables
        double doubleN = scanner.nextDouble();
        float floatN;
        floatN = (float) doubleN;
        System.out.println("Values of double and float");
        System.out.println(doubleN);
        System.out.println(floatN);

        //Cast float to long, print both variables
        long longN;
        longN = (long) floatN;
        System.out.println("Values of float and long");
        System.out.println(floatN);
        System.out.println(longN);

        //Cast long to int, print both variables
        int intN;
        intN = (int) longN;
        System.out.println("Values of long and int");
        System.out.println(longN);
        System.out.println(intN);

        //Cast int to short, print both results
        short shortN;
        shortN = (short) intN;
        System.out.println("Values of int and short");
        System.out.println(intN);
        System.out.println(shortN);

        //Cast short to byte, print both results
        byte byteN;
        byteN = (byte) shortN;
        System.out.println("Values of byte and short");
        System.out.println(byteN);
        System.out.println(shortN);
    }
}
