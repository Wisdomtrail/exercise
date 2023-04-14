public class Occurrence {
    public static void main(String[] args) {
        String string =  "Mississippi";
        char[] array = string.toCharArray();
        int iCounter = 0;
        int sCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 's'){
                sCounter++;
            }
            else if (array[i] == 'i'){
                iCounter++;
            }
        }
        System.out.printf("s occurred %d and i occurred %d", sCounter, iCounter);
    }
}
