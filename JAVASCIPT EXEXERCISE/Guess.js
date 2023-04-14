guess(4)

function guess(guess){
   let day = 4;
    console.log("guess the day");
        
        while (guess != day){
            console.log("sorry try again");
            guess = scanner.nextInt();
        }
        console.log("you got it correctly");
    }