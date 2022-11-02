let a = "a";
let b = "b";
let c = "c";

let obj1 = {a: a, b:b, c:c};
console.log(obj1);

let obj2 = {a, b, c};
console.log(obj2);

let obj3 = {x: "x", y: "y", z: "z"};
let {x, y, z} = obj3;
console.log(x,y,z);
let {i,j,k} = obj3;
console.log(i,j,k);


// obj copy
let obj4 = {...obj3};


let obj5 = {e : "e", f: "f", g: "g"};
let {e, f, g, h} = obj5;
console.log(e, f, g, h);