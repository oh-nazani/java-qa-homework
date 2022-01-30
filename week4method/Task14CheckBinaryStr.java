package week4method;

import java.util.Scanner;

public class Task14CheckBinaryStr
/* The binary number system uses 2 symbols, 0 and 1. Write a function called checkBinStr
   to verify a binary string. The program shall prompt the user for a binary string;
   and decide if the input string is a valid binary string. For example,
        Enter a binary string: 10101100
        "10101100" is a binary string
        Enter a binary string: 10120000
        "10120000" is NOT a binary string */
{
    static void checkBinaryStr(String binStr) {
        for (int i = 0; i < binStr.length(); i++) {
            if (binStr.charAt(i) != '0' || binStr.charAt(i) != '1') {
                System.out.println(binStr + " is NOT a binary string.");
                break;
            } else {
                System.out.println(binStr + " is a binary string.");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Input a binary string: ");
        Scanner scanner = new Scanner(System.in);
        String binStr = scanner.nextLine();
        checkBinaryStr(binStr);
    }
}
//չստացված

