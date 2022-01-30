package week4method;

/* Write a method called copyOf(), which takes an int Array
   and returns a copy of the given array. */


public class Task5CopyOfArr {
    static int[] copyOf(int[] array) {
        int[] copyOfarray = new int[array.length];
            for (int i = 0; i < copyOfarray.length; i++){
                copyOfarray[i] = array[i];
            }
//            for (int i = 0; i < copyOfarray.length; i++) {
//            System.out.print(copyOfarray[i] + " ");
//            }
          return copyOfarray;
        }

    public static void main(String[] args) {
        int[] array = {4, 7, 13, 5, 0};
        copyOf(array);
    }
}
// հարց