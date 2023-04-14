

answer = []
array = [1,2,3,4,5]
let count = -1;

lastIndex = array.length-1;
for (let i = 0; i < array.length; i++) {
    answer[i] = array[lastIndex];
    if (i >= 1) {
        answer[i] = array[count];
    }
    count++;
}
console.log(answer);