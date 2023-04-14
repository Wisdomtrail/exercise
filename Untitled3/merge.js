let array = [1,3,4,5];
let array2 = [2,6,7,8];
let mergedArray = [];
let backCounter = array2.length;
for (i = 0; i < array.length; i++) {
    mergedArray[i] = array[i];
    mergedArray[backCounter] = array2[i];
    backCounter++;
}
console.log(mergedArray);
