let num1 = 1;
let num2 = 2;
let num3 = 3;
let num4 = 4;
let num5 = 5;
let arr = [num1,num2,num3,num4,num5];
let largestNumber = 0;
let secondLargest = 0;
arr.forEach(element => {
    if(element > largestNumber){
        secondLargest = largestNumber;
        largestNumber = element;
    } else if (element > secondLargest && element < largestNumber) {
        secondLargest = element;
    }
});
console.log(secondLargest);    