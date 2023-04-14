import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many numbers will you enter: ");
        int numberOfElements = scanner.nextInt();

        int[] elements = new int[numberOfElements];
        int count = 0;
        for (int i = 1; i <= numberOfElements; i++) {
            System.out.println("enter number " + i);
            int num = scanner.nextInt();
            elements[count]= num;
            count++;
        }
        int largestNumber = 0;
        int secondLargest = 0;
        for (int j: elements) {
            if(j > largestNumber){
                secondLargest = largestNumber;
                largestNumber = j;
            } else if (j > secondLargest && j < largestNumber) {
                secondLargest = j;
            }
        }
        System.out.print(secondLargest);    }
}
