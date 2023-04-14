let array = [-4,-2,-5,1,2,3,6,-5,1];
let largestNum = 0;
let secondLargest = 0;
let thirdLargest = 0;
let fourthLargest = 0;
array.forEach(j => {
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
});
console.log(largestNum+secondLargest+thirdLargest+fourthLargest);