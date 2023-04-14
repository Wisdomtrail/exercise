import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number that consist of 1 and 0");
        String number = scanner.nextLine();
        char[] array = number.toCharArray();
        int count = array.length-1;
        int multiplier = 1;
        int[] answer = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] - 48) > 1 || (array[i]-48) < 0) {
                System.out.println("ode");
                break;
            }
            else
                answer[i] = (array[count]- 48)*multiplier;
            count--;
            multiplier*=2;
        }
        int sum = 0;
        for (int i = 0; i < answer.length; i++) {
            sum += answer[i];
        }
        System.out.println(sum);
    }
}

