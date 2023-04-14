import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 4;
        System.out.println("guess the day");
        int guess = scanner.nextInt();
        while (guess != day){
            System.out.println("sorry try again");
            guess = scanner.nextInt();
        }
        System.out.println("you got it correctly");
    }
}
