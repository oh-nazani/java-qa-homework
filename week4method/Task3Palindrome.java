package week4method;

/*A nonnegative integer is called a palindrome if it reads forward and backward in the same way.
  For example, the numbers 5, 121, 3443, and 123454321 are palindromes. Write a method that takes
  as input a nonnegative integer and returns true if the number is a palindrome;
  otherwise, it returns false. Also write a program to test your method
  (i.e write another function which will call your isPalindrome function and check if it works right).
 */
public class Task3Palindrome {
    static boolean isPalindrome(String intStr) {
        for (int i = 0; i < intStr.length() / 2; i++) {
            if(intStr.charAt(i) != intStr.charAt(intStr.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("154713"));
    }
}
