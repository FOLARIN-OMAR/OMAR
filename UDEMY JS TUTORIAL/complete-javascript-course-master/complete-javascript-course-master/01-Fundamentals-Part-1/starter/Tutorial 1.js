// values and variables
// let X = 23;
// console.log(X);

// let firstName = 'Omar';
// console.log(firstName);

// let PI = 3.1415



// Data Types
// let javascriptIsFun = true;
// console.log(javascriptIsFun)

// console.log(typeof true);
// console.log(typeof javascriptIsFun);
// console.log(typeof 23);
// console.log(typeof 'jonas');

// javascriptIsFun = 'YES!';
// console.log(typeof javascriptIsFun);

// let year;
// console.log(year);
// console.log(typeof year);

// year = 1991
// console.log(year);
// console.log(typeof year);



// const, let, var
// let age = 31;
// age = 30;

// const birthYear = 1990;
// birthYear = 1991;
// const job;

// var job = 'programmer'
// job = 'teacher'



// Math Opeartors
// const now = 2037;
// const ageJonas = now - 1991;
// const ageSarah = now - 2018;

// console.log(ageJonas, ageSarah);

// console.log(ageJonas * 2, ageJonas / 10, 2 ** 3);
// // 2 ** 3 means 2 raise to the power of 2

// const firstName = 'Omar';
// const lastName = 'Faruq';

// console.log(firstName + ' ' + lastName);


// Assignment Opeartors
// let x = 10 + 5;  // 15
// x += 10   // means x = x + 10 = 25
// x *= 4   //  means x = x * 4 = 100    
// x++     //   means x + 1 = 101
// x--    //    means x - 1 = 100
// console.log(x)


// Comparison Opeartor
// console.log(ageJonas > ageSarah);
// console.log(ageSarah >= 18);  



// const now = 2037;
// const ageJonas = now - 1991;
// const ageSarah = now - 2018;

// console.log(now - 1991 > now - 2018);

// let x, y;
// x = y = 25 - 10 - 5  // opeartion started from the right  x = y = 10.  y=10 and x=y which means x = 10 [ass opeartion starts from right]  
// console.log(x, y);

// const averageAge = (ageJonas + ageSarah) / 2;
// console.log(averageAge);


// test challenge 
// let markHeight = 1.69;
// let markMAss = 78;

// let johnMass = 92;
// let johnHeight = 1.95;


// let bmiMark = markMAss / markHeight ** 2;
// console.log(bmiMark);

// let bmiJohn = johnMass / (johnHeight * johnHeight);
// console.log(bmiJohn);

// const markHigherBmi = bmiMark > bmiJohn
// console.log(bmiMark, bmiJohn, markHigherBmi)



// strings and template literals
// const firstName = 'jonas';
// const job = 'teacher';
// const birthYear = 1991;
// const year = 2037;

// const jonas = "I'm " + firstName + ', a ' + (year - birthYear) + ' years old ' + job + '!';
// console.log (jonas);

// const jonasNew = `I'm ${firstName}, a ${year - birthYear} years old ${job}!`
// console.log (jonasNew);

// console.log (`just a regular string...`);

// console.log ('string with \n\
// multiple \n\
// lines');

// console.log (`string
// multiple
// lines.`)



// If else statements (taking decisions)
const age = 15

if(age >= 18) {
    console.log ('sarah can start driving livense 🚗');
}else {
    const yearsLeft = 18 - age;
    console.log (`Sarah is too young. wait another ${yearsLeft} years :)`);
}


const birthYear = 2012
let century;

if(birthYear <= 2000) {
    century = 20
}else {
    century = 21
}

console.log (century);