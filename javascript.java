<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <!-- <p id="p1"></p>
    <p class="p1"></p>

    <input type="text" id="inputOne">
    <button onclick="greetUser()">Click me</button>
    <p id="p2"></p>



    <p id="p3"></p>
    <button onclick="getName('Aanu')">Aanu</button>
    <button onclick="getName('Williams')">Williams</button>
    <button onclick="getName('Nicole')">Nicole</button>
    <button onclick="getName('Wole')">Wole</button>


    <button onclick="getNum(1)">1</button>
    <button onclick="getNum(2)">2</button>
    <button onclick="getNum(3)">3</button>
    <button onclick="getNum(4)">4</button>
    <button onclick="getNum(5)">5</button>
    <button onclick="getNum(6)">6</button>
    <button onclick="getNum(7)">7</button>
    <button onclick="getNum(8)">8</button>
    <button onclick="getNum(9)">9</button>
    <button onclick="getNum(0)">0</button>
    <p id="p4"></p> -->

    <input id="inputOne" type="text">
    <input id="inputTwo" type="text">
    <button onclick="multiply()">Click me</button>
    <div id="divOne"></div>

</body>
<script>






    //Array Iteration methods
    const arrayNum = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
    function multiply(item, index, arrayNum) {
        console.log(item * 5)
    }
    arrayNum.forEach(multiply)  // The forEach method calls a function for each item in an array. 

    arrayNum.forEach(function (item, index) {
        console.log(item * 15)
    })

    arrayNum.forEach((item, index) => {
        console.log(item * 6)
    })


    let test = arrayNum.map((item, index) => {
        console.log(item * 7)
        return item * 27;
    }) // The map method creates a new array from an existing array. It takes a function as an argument. The function returns the new array. To use a return statement, you assign the instance of the function with thr return statement to a variable. Said variable stores whatever you are returning from the array.
    console.log(test);

    let test2 = arrayNum.map(item => item * 7)
    console.log(test2);

    let test3 = arrayNum.filter((item, index) => {
        if (item % 2 === 0) {
            return item
        }
    }) // The filter method creates a new array from an existing array. It takes a function as an argument. The function returns the new array.
    console.log(test3)

    let nameArr = ["Wole", "Williams", "Tope", "Nicole", "Aanu", "Daniel"];
    let test4 = nameArr.filter((item, index) => {
        // let testRam = item.toLowerCase()
        // if(testRam.indexOf("a") !== -1){
        //     return testRam
        // } OR
        if (item.toLowerCase().indexOf("a") !== -1) {
            return item
        }
    })
    console.log(test4)

    let test5 = nameArr.find((item, index) => {
        if (item.toLowerCase().indexOf("a") !== -1) {
            return item
        }
    }) // The find method returns the first item in an array that passes a test.
    console.log(test5);

    const numArrayTwo = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20];
    let testNum = numArrayTwo.reduce((total, item) => {
        return total + item
    }, 0) // The reduce method reduces all the numbers in an array to a single value. It takes 2 arguments. The first argument is the accumulator and the second argument represents every item in the array during the iteration.

    console.log(testNum);

    let details = [
        { name: "Adewole", age: 1111 },
        { name: "Williams", age: 1112 },
        { name: "Nicole", age: 1113 },
        { name: "Aanuoluwapo", age: 1114 },
        { name: "Omamerie", age: 1115 },
        { name: "Tope", age: 1116 }
    ]

    let sumAge = details.reduce((total, item) => {
        return total + item.age
    }, 0)
    console.log(sumAge)






    //Destructuring in Javascript
    let nameArr2 = ["Wole", "Williams", "Tope", "Nicole", "Aanu", "Omamerie"];
    let [wole, name2, name3, name4, name5, name6] = nameArr2
    console.log(name3)

    let test6 = {
        surname:"Test",
        firstName:"SIx",
        email:"test6@gmail.com",
        age: 1119,
    }

    let {age, surname, email, firstName} = test6
    console.log(age, surname, email)


    //Spread operator
    let colorOne = ["Blue", "Green", "Red"];
    colorOne = [...colorOne, "Purple", "Indigo", "Violet"];
    console.log(colorOne);


    //Array methods
    // const arrOne = [0,1,2,3,4];
    // const arrTwo = [5,6,7,8,9];

    // let arrThree = arrOne.concat(arrTwo); // Used to concatenate or join two or more arrays together
    // console.log(arrThree);

    // const arrayName = ["Wole", "Williams", "Tope", "Nicole", "Omamerie"];
    // console.log(arrayName.length);
    // console.log(arrayName.toString())
    // let test = arrayName.pop(); // Removes the last item in the array
    // console.log(test)
    // console.log(arrayName)

    // arrayName.push("Daniel") // Adds a new item to the end of the array
    // console.log(arrayName);

    // arrayName.shift() // Removes the first item in the array
    // console.log(arrayName)

    // arrayName.unshift("Aanu") // Adds a new item to the beginning of the array
    // console.log(arrayName)

    // arrayName[2] = "Temitope";
    // console.log(arrayName)

    // arrayName[arrayName.length] = "Wole";
    // console.log(arrayName);

    // const fruits = ["Banana", "Apple", "Orange", "Pineapple", "Watermelon"];
    // fruits.splice(2, 3, "Carrot", "Kiwi", "Lime"); // Replaces an item(s) in an array with something else. Takes at least 3 arguments: The index of the item you want to remove, the number of items you want to remove and the replacement.
    // console.log(fruits)
    // fruits.splice(3, 1);
    // console.log(fruits); //You can use splice to carry out a delete operation. In this case, you only need 2 arguments. The first one is the index of the item you want to remove and the second one is the number of items you want to remove.

    // const colors = ["Blue", "Green", "Yellow", "Red", "Purple", "Indigo", "Violet", "Orange"];
    // let anotherColor = colors.slice(4, 7); //The slice method returns a new sub array from the original array. it takes 2 arguments: the index of the first item you want in your new array (from index 0) and the index (from 1) of the last item you want in your new array. 
    // console.log(anotherColor);

    // colors.sort() // The sort method sorts out the items in an array alphabetically.
    // console.log(colors)

    // colors.reverse() //The reverse method reverses the items in an array
    // console.log(colors);


    // let details = [
    //     {name:"Wole", age:1111, color:"Grey", isSingle:true},
    //     {name:"Williams", age:1112, color:"Black", isSingle:true},
    //     {name:"Tope", age:1113, color:"Green", isSingle:false},
    //     {name:"Nicole", age:1114, color:"Red", isSingle:true},
    //     {name:"Omamaeri", age:1115, color:"Red", isSingle:true},
    //     {name:"Aanu", age:1116, color:"Red", isSingle:false},
    // ]

    // details.push({name:"Test", age:1117, color:"white", isSingle})

    // for (let i = 0; i < details.length; i++) {
    //     const element = details[i];
    //     console.log(`These are my details: First name=${element.name}, Age=${element.age}, Color=${element.color}, isSingle=${element.isSingle}`)
    // }





    //Number methods in JavaScript
    // let numOne = 55;
    // console.log(numOne);

    // numOne

    // let strNumOne = numOne.toString()
    // console.log(strNumOne)

    // let numTwo = 234567890;
    // console.log(numTwo.toExponential(5))

    // console.log(numTwo.toPrecision(5))



    // let name = "1111";
    // name = parseInt(name)
    // console.log(Number)




    // let inputOne = document.getElementById("inputOne");
    // let inputTwo = document.getElementById("inputTwo");
    // let divOne = document.getElementById("divOne")

    // function multiply (){
    //     let firstValue = Number(inputOne.value);
    //     let secondValue = Number(inputTwo.value);

    //     if(isNaN(firstValue) && isNaN(secondValue)){
    //         alert("Invalid inputs")
    //     }else{
    //         for (let i = 0; i <= secondValue; i++) {
    //             divOne.innerHTML += `<p>${firstValue} times ${i} = ${firstValue * i}</p>`
    //         }
    //     }
    // }

    // //String methods and properties in JavaScript;
    // let nameOne = "Williams | Tope | Nicole | Aanu | Daniel";
    // console.log(nameOne.length);        // returns the length of the string
    // console.log(nameOne.indexOf("z")); // returns the index of the first occurrence of the character. If the character is not found, it returns -1
    // console.log(nameOne.lastIndexOf("i")); // returns the index of the last occurrence of the character. If the character is not found, it returns -1
    // console.log(nameOne.split("a")) // returns an array of strings. It takes one argument which is the separator

    // let club = "Chelsea";

    // console.log(club.concat(", Liverpool", ", Manchester United", ", Real Madrid"))

    // let anotherName = "Aanuoluwapo";
    // console.log(anotherName.slice(-4, 4)) // Takes two arguments. You count the first argument from index 0 and the second argument from index 1.
    // console.log(anotherName.slice(4))

    // let yetAnotherName = "Temitope";
    // console.log(yetAnotherName.substring(-4, 4)) // Takes two arguments. You count the first argument from index 0 and the second argument from index 1.

    // // let myName = prompt("Enter your name: ");
    // // console.log(`My name is ${myName}`);

    // let clubs = "Chelsea, Liverpool, aRsEnAl, Man-Utd";
    // console.log(clubs.toLowerCase()); // converts the string to lowercase
    // clubs = clubs.toUpperCase(); // converts the string to uppercase
    // console.log(clubs.replace("ARSENAL", "MAN-CITY")); //The replace method takes two arguments. The first argument is the string to be replaced and the second argument is the string to replace the first argument with.

    // console.log(clubs.search("LIVERPOOL")) // returns the index of the first occurrence of the string. If the string is not found, it returns -1

    // let differentName = " Adewole ";
    // console.log(differentName.length);
    // console.log(differentName.trim().length); // removes the white spaces at the beginning and end of the string. You use trimStart() to remove the white spaces at the beginning of the string and trimEnd() to remove the white spaces at the end of the string.

    // let anotherDifferentName  = "Omamerie";
    // console.log(anotherDifferentName.match("rie")) // returns an array of the first occurrence of the string. If the string is not found, it returns null




    //Loops In JavaScript
    // const arrOne = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
    // for (let i = 0; i < arrOne.length; i++) {
    //     const element = arrOne[i];
    //     console.log(element * 5);
    // }

    // const nameArr = ["Wole", "Williams", "Tope", "Nicole", "Aanu", "Daniel"];
    // for (let j = 0; j < nameArr.length; j++) {
    //     console.log(`My name is ${nameArr[j]}`)
    // }

    // let myName = "Ovuvuevuevueoyemenetweogbemugbemosas"
    // for (let k = 0; k < myName.length; k++) {
    //     console.log(myName[k])
    // }

    // for (let l = 1; l <= 30; l++) {
    //     if (l % 2 === 0){
    //         console.log(l)
    //     }
    // }

    // let num1 = 1;
    // while (num1 < 10) {
    //     console.log("I hate amala");
    //     num1++;
    // }

    // let num2 = 1;
    // do{
    //     console.log("I like eba");
    //     num2++;
    // }while (num2 > 10) 

    //Functions in JavaScript

    // function getNameOne(){

    // }

    // const getNameTwo = function(){

    // }

    // const getNameThree = () => {

    // }

    // let p4 = document.getElementById("p4");


    // function getNum(num){
    //     p4.innerHTML += num
    // }

    // function addNum(a, b) {
    //     return a + b
    // }
    // let test = addNum(7, 8);
    // console.log(test)



    // let p3 = document.getElementById("p3");
    // function getName(name) {
    //     p3.innerHTML = `My name is ${name}`;
    // }

    // parseint() and Number() are used to convert strings to numbers




    // var second
    // let first

    // // console.log(first + second);

    // first = 9;
    // second = 11

    // console.log(first + second)

    // let name = "Adewole";

    // const names = ["Adewole", "Nicole", "Aanuoluwapo", "Omamerie", "Oluwaseun", "Williams"]
    // console.log(names[4])

    // const details = {
    //     name: "Adewole",
    //     age: 23,
    //     sex: "male",
    //     isSingle: true,
    //     church: undefined,
    //     likesAmala: false,
    //     colors: ["grey", "blue", "black"]
    // }

    // console.log(details.colors);
    // //ogunbaja07@gmail.com

    // //Assignment operators
    // let name2 = "Williams";
    // let numOne = 5;
    // let numTwo = 10;

    // numTwo += numOne;
    // console.log(numTwo);

    // numTwo -= 7;
    // console.log(numTwo);

    // numOne *= 3;
    // console.log(numOne);

    // numOne /= 5
    // console.log(numOne)

    // //Arithmetic Operators
    // let numThree = 75;
    // let numFour = 15;

    // console.log(numThree + numFour) //Addition Operator
    // console.log(numThree - numFour) //Subtraction Operator
    // console.log(numThree / numFour) //Division Operator
    // console.log(numThree * numFour) //Multiplication Operator
    // console.log(numThree ** numFour) //Exponent Operator
    // console.log(numThree % numFour) //Modulo Operator

    // //Comparison Operators
    // let numFive = 78
    // let numSix = 79
    // let numSeven = 80
    // let numEight = 81

    // console.log(numFive == "78");
    // console.log(numFive === "78");
    // console.log(numSix != "79");
    // console.log(numSeven !== "80");
    // console.log(numSeven < numEight);
    // console.log(numSeven <= numFive);
    // console.log(numEight >= numSix);



    // //Logical operators
    // console.log(numFive === numSix && numEight !== numSeven);
    // console.log(numFive == "78" && numSix !== numEight || numSeven == "80")

    // numFive !== numEight ? alert("true") : alert("false")

    // let name3 = prompt("Enter your first name")
    // // alert("Welcome " + name3)
    // alert(`Welcome, ${name3}`)



    // Conditional statements in JavaScript
    // let yourName = prompt("Enter your name");

    // yourName === "Aanu" ? alert("Happy robbery") : alert("This does not concern you.")

    // if (yourName === "Aanu") {
    //     alert("Happy robbery");
    // } else if (yourName === "Williams") {
    //     alert("Happy robbery");
    // } else {
    //     alert("This does not concern you");
    // }

    // if (yourName !== "Aanu" || yourName !== "Williams") {
    //     alert("This does not concern you");
    // } else {
    //     alert("Happy robbery")
    // }


    // switch (yourName) {
    //     case "Aanu":
    //         alert("Happy robbery")
    //         break;

    //     case "Williams":
    //         alert("Happy robbery")
    //         break;

    //     case "Tope":
    //         alert("Happy robbery")
    //         break;

    //     default:
    //         alert("This does not concern you")
    //         break;
    // }




    //DOM manipulation
    // let p1 = document.getElementById("p1")
    // p1.innerHTML = "<i>Welcome to Javascript</i>"

    // let anotherP1 = document.querySelector(".p1")
    // anotherP1.innerHTML = "<i>Welcome to Javascript</i>"

    // let parent = document.body;
    // let divOne = document.createElement("div");
    // parent.appendChild(divOne);
    // divOne.style.width = "200px";
    // divOne.style.height = "200px";
    // divOne.style.backgroundColor = "red";
    // divOne.innerText = "Welcome to this class 😊😊😊😊"

    // let inputOne = document.getElementById("inputOne")
    // let p2 = document.getElementById("p2")
    // function greetUser(){
    //     let name = inputOne.value;
    //     p2.innerHTML = `Welcome ${name}. We are happy to see you`
    // }

    //ogunbaja07@gmail.com


    const firstFunction = (a, b) => {
        let add = a + b;
        let subtract = a - b;
        let divide = a / b;
        let multiply = a * b;
        return multiply
    }

    const secondFunction = ((a, b) => a * b)


</script>

</html>