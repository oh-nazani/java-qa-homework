package week6practical;
// unenq zangvac, vorn ir mej uni 0-ner, grel method, vor@ kveradardzni zangvac,
// vorum 0-ner@ verjum en, isk mnacac tver@ skzbum ayn hertakanutyamb, vorov grvel en.
public class Arr0 {
    public static int[] shiftZeros(int[] array){
        int[] newArray = new int[array.length];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                newArray[j]=array[i];
                j++;
            }
        }
        return newArray;
    }
}
