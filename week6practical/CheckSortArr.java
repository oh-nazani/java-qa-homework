package week6practical;

//գրել մեթոդ, որը կստուգի զանգվածը սորտավորված է աճման կարգով, թե ոչ
public class CheckSortArr {
    static boolean checkIfSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 10, 15};
        System.out.println(checkIfSorted(arr));
    }

}
