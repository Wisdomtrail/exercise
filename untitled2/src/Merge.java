import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] array = {1,3,4,5};
        int[] array2 = {2,6,7,8};
        int[] mergedArray = new int[array2.length+array.length];
        int backCounter = array2.length;
        for (int i = 0; i < array.length; i++) {
            mergedArray[i] = array[i];
            mergedArray[backCounter] = array2[i];
            backCounter++;
        }
        System.out.println(Arrays.toString(mergedArray));
    }
}
