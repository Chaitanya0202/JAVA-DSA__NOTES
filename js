// NOTE  --->

// Primitive datatype in javascript-->
// string
// number
// boolean
// undefined


// 1) split()
// 2) sort
// 3) concate
// 4) map
// 5) filter
// 6) reverse
// 7) indexof And lastIndexof
// 8) forEach() && forOf
// 9) every()----->not Working
// 10) includes()
// 11) join()
// 12) find()
// 13) fill()
// 14) slice()
// 15) push()
// 16) pop ()
// 17) shift() and unshift()
// 18) flat()
// 19) spread()
//  reduce

//................String Methods..
// note --> all String method are returns new String , they can not modify orignal string
// Bcoz String are immutable

//   20)   slice () ,substring() and substr()
//   21)   replace()
//   22)   toUpperCase() And toLowerCase()
// 23)   trim()
// 24)  pad()
// 25)  toString()
// 26)  charCodeAt(0)
// 27) Escape CHarector --->  \" text \"



//I]     Object
//II]  Array
//II]   Map
//III] Function


// *)Methods
//      1) split-->
//             split is used for converting the String into array formate
//             ex.
//     let s="india is my Country";
//     let s1=s.split(' ');
//     console.log(s1);
//     console.log(typeof s1);

// output
//  ['i', 'n', 'd', 'i', 'a', ' ', 'i', 's', ' ', 'm', 'y', ' ', 'C', 'o', 'u', 'n', 't', 'r', 'y']               //

//  split--->
// 1) split is only used for string datatype  can not work for number
// it used for separate or split the String element and store in array formate
// we can can not make changes in the orignal string after split
// thats mean we have to store in different variable after making split

// let a="123";

// let b=a.split("").reverse().join("");
// // let c=a.split("");

// console.log(b);
// console.log(c);
// console.log(typeof b);
// console.log(typeof c);

//      2) sort ---->
//              sort is a method is used for arrenging the array or string in order
// which can be asending or it can be in decending order
//we can not sort string  if you want to sort string then take that in the array formate
// then make sort
// Ex.String sorsting

// let s="helo a my is 2"
// let x=s.split(' ');
// console.log(x.sort())

// let strin=["hello","a","b"];
// strin.sort()
// console.log(strin)

// 2) array sorting
// let st=[2,4,73,6,7,3]
// st.sort().reverse()
// st.sort().reverse()
// console.log(st)

// let st="hello hero";
// st.split(' ');
// // st.sort()
// console.log(st)

//desending order

// let st=[2,4,73,6,7,3];
// let des=st.sort((a,b)=>a>b ? -1:1);
// console.log(des);

//      3) concate--->
//  concate method is used for marging the element or adding the element in array
// ex
// let a=[1,2,3,4];
// let b=[5,6,7];
// let onemore=[10,20,30];
// let c=a.concat(b,onemore,50); //concating two array and value

// console.log(c);
//
//  4) map function
// is used for make changes  in the each element in the array
// ex
// after making the changes we can store in the same or different also array
// 2) also it can be used for itarate the array
//     let arr=[2,3,4,5];
//     let arr1=arr.map((ele)=>ele+5);
//     console.log(arr1);
//     console.log(arr);



// // or
// arr=arr.map((ele)=>Math.pow(ele,3));
// console.log(arr);

// 5) filter function --->
// it is used for filtering the conditiion for each element in the array
// after filtering the condition we can store the leteral in same or different vaiable also
// ex
// let ar=[2,3,4,5,7,8,9];
// let b=ar.filter((ele)=>ele%2==0);
// console.log(b);

// ar=ar.filter((ele)=>ele%2!=0);
// console.log(ar);

// 6)reverse() function--->
// reverse function is used for reverse the number or string \
// ex
// let s="";
// let num="gekk";
// for(let i=0;num!=0;i++){
//     s+=num%10;
//     num=Math.floor(num/10);
// }

// let n=num.split("").reverse().join("");
// console.log(n)

// let n="hello";    ///CTE we can not reverse String
// let n=[3,2,1];
// let m=n.split("").reverse().join("")
// let m = n.sort().reverse().join();
// console.log(m);

// -----------------------------------------------------------------------------------------
//  practices
// making the string sort reverse nd store

// let s="hello";
// let t=s.split('').sort().reverse().join('');
// console.log(t);

// --------------------------------------------------------------------------------------

// 7) index function ---->
// it is used for finding the index of element in array
// let arr=[2,3,5,2,5,7];
// console.log(arr.indexOf(3));
// only differeance is  lastIndexOf is start the searching element from the last of the array
// let arr=[2,7,3,5,2,5,7];
// console.log(arr.lastIndexOf(7));

// 8) forEach Function --->
// forEach loop work only on Array [its work for string after making split]
// it helps to execute over the Array / display all elements
// let a=[2,4,5,6,3];

// let a="hello hekki";
// let d;
// let b=a.split('')

// console.log(b)

// let b="skjdf lkg".split('')
// b.forEach(element => {
//         console.log(element)
// })


// -----------------------------------------------------------------------
// let z="honprable hello"
// let z=[2,4,6,3,6]
// for (const iterator of z) {
//         console.log(iterator)
// }




// datatypes -->
// number 
// String
// boolean 
// undefined
// Symbols
// Object


// a.forEach(element => {
//         console.log(element);
// });

// 9) every()---> [not working]
// its check each elements in the aaray which all returning true or false after giving the condition

// ex /
// let s=[2,3,4,6,8]
// let t=[2,4,6,8,0];
// let u=t.every(ele<9);
// console.log(s.every(ele<9));

// 10)includes -->  it is used for checking the element is present or not in the array
// it return boolean value
// let t=[2,4,6,8,0];
// let s=t.includes(7);
// console.log(s);

//11) join()  ---> it is used for join or marge all array elements and convert them into string
// ex
// let s=["hello","iam","good","boy"];
// let t=s.join('*');// specify the symbols what ever u want
// console.log(t);

// op-->hello*iam*good*boy

//12) find() --->
// it returm the first value after pass the condition

// let num=[1,2,3,4,5,6,7];
// let num2=num.find(ele=>ele>5);
// console.log(num2); //6

//op--->6

// 1) findIndex --> is uesed for find the index after pass the condeitionn/
// ex ..
// let num=[3,4,3,7,36,6]
// let num3=num.findIndex(ele=>ele>3);
// console.log(num3);

// 13) fill()-->it is used for fill or insert the value to default value
// ex
// let arr=new Array(3);
// console.log(arr);
// let arr2=arr.fill(10);
// console.log(arr2);

// 14) slice()-->
// 1) it used for extract the elements in  perticular range
// its return the new array after giving the start and end index for new array
// we can not store in same  array after extract elements
// let arr=[1,2,4,5,7,9];
// let arr="helloksdbalkdfnckksdr";
// let arr2=arr.slice(2,5);
// console.log(arr2);

// let s=["hii","hello","bye","my","mane"];
// let t=s.slice(0,2);
// let t=s.slice(3,); //last index is optional
// console.log(t);

//  15)PUSH()--->
// it will helps to add one or more element in last of the array
// ex
// let a=[1,2,3,4];
// a.push(5);
// console.log(a);

// op--->[1, 2, 3, 4, 5]

// 16) pop()--->
// it remove the last element in the array
// let b=[1,2,3,5,4];
// b.pop();
// console.log(b);
// op--->[1, 2, 3,5]



//17) shift()--->

// it remove the first elemetn in the array
// let a=[1,2,3,4];
// a.shift();
// console.log(a);

// unshift----> it add one or more  element at the first index int the array
// a.unshift(23);
// console.log(a);

//18) flat()-->
// it used for converting the two dimensonal array into single dimensional array
// let arr=[[1,2,3],[4,5,6]];
// console.log(arr)
// let arr1=arr.flat();
// console.log(arr1);

// 19) spred()--->
// it is used for copy or converting or storing the array
// 1) copy the all elements in different array
// let ar=[2,3,4] ;
// let b=[...ar]
// console.log(b);


// 2) concating the two array
// let arr2=[5,6,7];
// let marged=[...ar,...arr2];
// console.log(marged);

//  3) calling function

// function f1(a,b){
//         return a+b;
// }
// let t=[10,20];
// console.log(f1(...t));

// slice ,substring and substr are used to extract the element in the string

// ------------------- reduce
// const arr=[2,4,6,3,8];

// reduce method takes two method first as function and second arg take initial value or result
// first arguments take function and that function takes two argumets 
//  below code excute like that 
// first  add 2 and 4  then whateven result comes it make additon with next value(6)

// const result=arr.reduce((acc,ele)=>{
//         return acc+ele
// },0)
// console.log(result)


// 20) slice -->
// let a="Chetan";
// console.log(a.slice(2,1));//--->Empty
// console.log(a.substring(2,1));//-->swap the arguments if startIndex is Greater than EndIndex -->Always Return SOmethiing
// console.log(a.substr(2,4));// second parameter take default length of the str

// 21) replace()--->
// this method is used to replace element in string or array
// can not change orignal value
// let a="Chetan is good   boy ";
// let c=a.replace('e','E')
// console.log(a.replace('is','was'));

// the parameter of replace method is case sensetive
// BUT we can make them case insensitive as follow

// console.log(a.replace(/IS/i,'was'));
// console.log(c);

// it is used for replacing all the value which
// console.log(a.replace(/is/g,'was'));

// we can only use replace method with string not array

// let b=["chetan","is","good","boy"]
// console.log(b);
// console.log(b.replace("good","bad"));

// 22) toUpperCase And toLowerCase()---->
//    are user to transform the lower to upper or upper to lower case
// let n="chetan";
// console.log(n.toUpperCase());
// console.log(n.toLowerCase())

// console.log(n.charAt(0).toUpperCase());
// let a=n.charAt(0).toUpperCase()
// let b=a+n.slice(1,);//---> Chetan
// console.log(b)

// 23) trim()--> used to remove whitespace of world
// 1) a.trimStrat --> remove whitedspace of start of the word
// 2) a.trimEnd()--> remoce whithspace at the end of the word
// let a="  helo  ";
// console.log(a.trim());
// console.log(a);

// console.log(a.trim()); //it remove both sides whitespace
// console.log(a.trimStart());
// console.log(a.trimEnd());

// 24) pad()--> two subtype -->1) a.padStart() 2) a.padEnd()

// let text = "5";
// // console.log(text.pad(2,"ll"));// its give error bcoz we have to specify where oyou want give padding as start or end
// let padded = text.padStart(6,"0")// 1st parameter is for how many time want
// //                                 // 2nd is for what string you want give as padding
// console.log(padded)

// 25)toString()---> used for converting the number into String
// let num=6;
// // num.toString();//we can not change string we have to store in different variable
// let num1=num.toString();
// console.log(typeof num1);

//26) charCodeAt()---> it give ASCII value of charector

// code for converting char to its ASCII value then return charector form
// let a='c'
// console.log(a.charCodeAt());

// let b=a.toUpperCase();


// console.log(r.charAt(0).toLowerCase());

// ********* program for print first char should be in the Cap********************
// let a=["hello","iam","superman"];
// let ans2="";
// a.forEach(element => {
//         let st=element[0];
//         let st1=st.toUpperCase();
//         let end=element.slice(1,);
//         let ans=st1+end;
//         ans2+=ans+" ";

// });
// console.log(ans2);

// 27)  Escape Charector ---> in JS String is written in Double Quote so compiler misunderstand the string therefor we use escape charector such as

// let s=" he also known as \"spiderman\" and it is one of my fev";


// let q=" this charector \\ is known as single slash";
// console.log('It\'s allright')

// // console.log(`It's allright`); when we use templete literal then no need to take  \ or \"
// console.log(s);
// console.log(q);


// --------------------------------------------------------------------------
//                                OBJECT CREATING
// -------------------------------------------------------------------------
// 1)Creating Object Using Literal Data

// let obj={
//         name:"Chetan",
//         address:"pune",
//         email:"a@123"
//     }
//     console.log("Read "+obj.name)// read

//     obj.address="BLR"
//     console.log("Updated "+obj.address)//Updated

//     delete(obj.name);

//     console.log("Deleted "+ obj)// Deleted

//     console.log(obj)

//     obj.age=34;
//     console.log(obj)// Added New Key Value Pair
//----------------------------------------------------
//                    // 2) -----Creating Object Using New Keyword
//     let obj2=new Object

//     obj2.name1='Chetan'
//     obj2.city="Pune"
//     console.log(obj2)

//                   //3) ---------Creating Object Using Function/Constructor
//     function obj3(id,name2,add){
//         this.id=id;
//         this.name2=name2;
//         this.add=add;
//     }
//     let s=new obj3(2,"tony","goa");
//     console.log(s)
//     console.log(s.id+s.add);



//---------------------------------------------------------------------------------------------------S
//                                         ARRAY
// ---------------------------------------------------------------------------------------------------

// 1) First way to Create Array Uding Data Literal'
// let arr=['sd','chetan','ram','sham']
// console.log(arr[3]);
// console.log([...arr,78])// add Using Spread Operatoer


// //2) second Way to Create Array Using new Key Word
// let arr2=new Array;
// arr2[0]="main"
// arr2[1]="hu"
// arr2[2]="Don"
// console.log(arr2)
// console.log(arr2.concat(arr))//concateing Two Array


// // 3) Direct
// let arr3=new Array(3,4,5,6)
// console.log(arr3)


// ---------------------------------------------------------------------------
//                              FUNCTIONS                
//-----------------------------------------------------------------------
//  1) No Arguments Function
//  2) Parameterixe Function
//  3) Anonymous Function
// 4)  self-Invoking function
// 5)  Clouer / Nested Function
// 6)  Async Function-->1)asynch and await
// 7) Expression Function
// 8) Fat Arrow Function
// 9) callback Function

// ********************************************************************************
// Map
// ********************************************************************
// const fruite=new Map([
//         ["apple",500],
//         ["graps",200],
//         ["banana",34]
// ])
// fruite.forEach(element => {
//         console.log(element)//-->500,200,34
// });
// for (const iterator of fruite) {   ///  ['apple', 500]
//         console.log(iterator)//        ['graps', 200]
//                                 //    ['banana', 34]
// }




// ********************************************************************
//                       1) No Arguments Function
// function a(){
//     console.log("this is no Argumetns function");
// }
// a();
//------------------------//
//                       2) Parameterixe Function--> 
// the function which takes the parameter as input(formal argumetns)

// function b(name){
//         console.log(`My Name is ${name}`);
// }
// b("Chetan")
//-----------------------------//
//                      3) Anonymous Function
// --> The Function without Function_Name is called anonymous Function

// function (){
//         console.log("dljg")
// }()
// OR
// (() => {
//   console.log("this is anonymou function");
// })();



//-------------------------------//
//                      4)  self-Invoking function 
// the Function which not need to call for execute
// function inclosed in () 
// we can not call self invoking function with its Fun_Name

// (function a(){
//         console.log("This is From Self Invoking Function");
// })();

//--------------------------------//
//                      5) Clouer / Nested Function
// --->The Function Having Another Function inside it is known as clouser or nested function

// Define--> a Function along with its slecicle scope bundle together is known as Clouser
// function a(){
//         let num1=9;
//         function b(){
//                 console.log("THis is innerr Fuction") 
//         }
//         console.log("THis is outer Function")
//         b()
// }
// a()
// Note---> the Scope of the inner Function only till inner function we can not call outside of the outer Function
//-----------------------------//
//                      6)  Asynchronis Function


// this function used for waite untill data Geeting from API 

// const AsFun= async()=>{
//         await axios.post("https://localhost:8080/saveFunctionName",object)
// }


// setTimeout(ab,2000);//--> setTimeout used to excute only once after mention time interval
// function ab(){
//         console.log("I Love India")
// }

// setInterval(ab,4000)//--> setInterval is used for iterate or call perticular Function continously


//--------------------------------------------------------------------------------
//-----------------  7)          Expression Function             --------------

// let fun=function (){
//         console.log("This Is Expression Function");
// }
// fun();
//------------------------------------------------------------------

// 8) Fat Arrow Function
//ES6
// let f=()=>{
//         console.log("This is Fat Arrow Function");
// }
// f()
//------------------------------------------------
// 9) callback Function
//  javascript is the Synchronous single threded languge so to make the Asynchronous language
//  we use callback fuction
// giving the function as a parameter to another function is known as callback Function

//  setTimeout(function () {
//         console.log("After 2000ms")
//  },2000)
// function x(y){
//         console.log("The X FunctionIs called")
//         y()
// }

// x(function y(){
//         console.log("This is y Fuction From Fun Parameter")
// })


// ***********************************************************************************************************




// --------------------------------------------------------------------

// 1) charCodeAt()--> used to convert the char to ASCII
// 2)String.fromCharCode()--> used to convert the ASCII to Charector




// let a='111'
// console.log(String.fromCharCode(a))
// console.log(a.charCodeAt())


//   to gerarate Ramdom Integer Value 
// console.log(Math.floor((Math.random()*(1000-900)+900)))//   ((max-min)+min)




// ----------------------------------------------------------------------------------------
// 1) if try to use the variable before initialize we get undifined
// let  a
// console.log(a);
// 2)
// console.log(a);
// let a=8//-->error
// var a=8//--->undifined

// var a=23;

// ---------------------------------------------------------------------------------
//                              let var const                                       //
// --------------------------------------------------------------------------------

// var a=10
// console.log(a)
// function b(){
//         console.log(a)
// }
// b()
// let  a=10
// console.log(a)
// function b(){
//         console.log(a)
// }
// b()

// function Ab(){
//         let a=1;            // Error We cant use Block scope variablr outside of the block
// }
// Ab()
// console.log(a)

// var a=1;
// {
//         var  b=2;
//         let c=4;     // we can use declared var variable outside of that block also []its fuctional scope

// }
// console.log(b)
// console.log(c)   ///eror
// ------------------------------------------------------------
// functions statements or fucnctions declaration
// a();// we can call function before declaration  //
// b();// but we can not call expression function before declaration

// function a(){
//         console.log("a called");
// }


// let b=function b(){
//         console.log("b called");
// }
// a();//
// b();
// ---------------------------------------------------------------
// let c;            // we can use variable before initialize 
// console.log(c)   // --> undefined
// c=8


// --------
// console.log(a);    // Using variable before declaration is known as Hoisting
//                 //  we can hoist only Var variable but not Let and Const
// var a=23;  // --> undefined


// ------------------------------------------------------------
//  Promises 
// ------------------------


// Make a fetch request to the API
//  fetch('https://jsonplaceholder.typicode.com/todos/2')
//         .then(response => {
//                 if (!response.ok) {
//                         throw new Error(`Network response was not ok (status ${response.status})`);
//                 }
//                 return response.json(); // Parse the response body as JSON
//         })
//         .then(data1     => {
//                 console.log('Data received:', data1);
//                 // Handle the data (e.g., update UI, process results)
//         })
//         .catch(error => {
//                 console.error('Error fetching data:', error);
//                 // Handle errors (e.g., show an error message)
//         });




// let arrr = [ 1,0,0,5,7,3,1,5]
// let res;
// for(let i=0;i<8;i++){
//     for(let j=i;j<8;j++){
//         if(arrr[i]==arrr[j]){
//             continue;
//         }
//         else{
//             res[i]=arrr[i];
//         }
//     }
// }
fetch('https://jsonplaceholder.typicode.com/posts/1')
    .then((response)=>{
        return response.json();
    })
    .then((data)=>{
        console.log(data);
    })
    .catch((error)=>{
        console.log("error in fetching data",error);
    })
