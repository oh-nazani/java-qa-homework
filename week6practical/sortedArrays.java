package week6practical;
//ունենք սորտավորված 2 զանգված, ստանալ մի զանգված, որը սորտավորված է և պարունակում է այդ 2 զանգվածները

public class sortedArrays {
    public static int[] merge(int[] first, int[] second) {
        int size1 = first.length;
        int size2 = second.length;
        int[] merged = new int[size1 + size2];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (first[i] < second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            merged[k] = first[i];//merged[k++] = first[i++]; without 22-23 lines
            i++;
            k++;
        }
        while (j < size2) {
            merged[k] = second[j];//merged[k++] = second[j++]; without 27-28 lines
            j++;
            k++;
        }
        return merged;
    }
}

