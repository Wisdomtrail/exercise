public class Maximum {
    public static void main(String[] args) {
        int[] array = {-4,-2,-5,1,2,3,6,-5,1};
        int largestNum = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        int fourthLargest = 0;
        for (int j: array) {
            if(j > largestNum){
                fourthLargest = thirdLargest;
                thirdLargest = secondLargest;
                secondLargest = largestNum;
                largestNum = j;
            } else if (j > secondLargest && j < largestNum) {
                fourthLargest = thirdLargest;
                thirdLargest = secondLargest;
                secondLargest = j;
            } else if (j > thirdLargest && j < secondLargest){
                fourthLargest = thirdLargest;
                thirdLargest = j;
            } else if (j > fourthLargest && j < thirdLargest ){
                fourthLargest = j;
            }
        }
        System.out.println(largestNum+secondLargest+thirdLargest+fourthLargest);

    }
}
