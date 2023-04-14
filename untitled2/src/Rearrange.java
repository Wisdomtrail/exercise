import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int[] array = {10, -1, 20 ,4, 5, -9, -6};
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                newArray[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                newArray[count] = array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
