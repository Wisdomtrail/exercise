array = [10, -1, 20 ,4, 5, -9, -6];
let newArray = []
let count = 0;
for (i = 0; i < array.length; i++) {
    if (array[i] < 0){
        newArray[count] = array[i];
        count++;
    }
}
for (i = 0; i < array.length; i++) {
    if (array[i] > 0){
        newArray[count] = array[i];
        count++;
    }
}
console.log(newArray)