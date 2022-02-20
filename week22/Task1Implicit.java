package week2;

import java.util.Scanner;

public class Task1Implicit
// Widening Primitive Conversion (Implicit)
// Write java program, which has byte type variable(Input variables from console)
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cast byte to short type, print both variables
        byte byteN = scanner.nextByte();
        short shortN;
        shortN = byteN;
        System.out.println("Values of byte and short");
        System.out.println(byteN);
        System.out.println(shortN);

        //Cast short to int, print both variables
        int intN;
        intN = shortN;
        System.out.println("Values of short and int");
        System.out.println(shortN);
        System.out.println(intN);

        //Cast int to long, print both variables
        long longN;
        longN = intN;
        System.out.println("Values of int and long");
        System.out.println(intN);
        System.out.println(longN);

        //Cast long to float, print both variables
        float floatN;
        floatN = (float) longN;
        System.out.println("Values of long and float");
        System.out.println(longN);
        System.out.println(floatN);

        //Cast float to double type, print both variables
        double doubleN;
        doubleN = (double) floatN;
        System.out.println("Values of float and double");
        System.out.println(floatN);
        System.out.println(doubleN);
    }
}