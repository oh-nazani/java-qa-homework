package week4method;

// Write a function which checks if the given String contains a given character.
// Pass as parameters String str, char ch


public class Task11ContainsChar {
    static boolean containsChar(String str, char ch){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "symbols...";
        char ch = 's';
        System.out.println(containsChar(str, ch));
    }
}
