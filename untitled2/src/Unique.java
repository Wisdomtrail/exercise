public class Unique {
    public static void main(String[] args) {
        int[] array = {9,2,3,2,6,6};
        int unique = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && j != i) {

                    break;
                }
                else
                    unique = array[i];
            }
        }
        System.out.println(unique);
    }
}
//todo