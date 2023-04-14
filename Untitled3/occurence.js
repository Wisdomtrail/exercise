let string =  "Mississippi";
let  array = string.split('');
let iCounter = 0;
let sCounter = 0;
for (let i = 0; i < array.length; i++) {
    if (array[i] == 's'){
        sCounter++;
    }
    else if (array[i] == 'i'){
        iCounter++;
    }
}
console.log("s occured "+sCounter+" times and i occured "+iCounter+" times");
