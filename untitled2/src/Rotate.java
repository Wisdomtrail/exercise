import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] answer = rotateArray(array);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] rotateArray(int[] array){
        int count = -1;
        int[] answer = new int[array.length];
        int lastIndex = array.length-1;
        for (int i = 0; i < array.length; i++) {
            answer[i] = array[lastIndex];
            if (i >= 1) {
                answer[i] = array[count];
            }
            count++;
        }
        return answer;
    }
}