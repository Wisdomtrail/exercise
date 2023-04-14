import java.util.Arrays;

public class Product {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum =1;

        int count = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            sum*=arr[count];
            count--;
        }
        int[] newArr = {sum};
        System.out.println(Arrays.toString(newArr));
    }
}

