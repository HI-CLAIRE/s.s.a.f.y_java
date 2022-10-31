let a;
const b = 'b';
var c; // deprecated

console.log(a);
console.log(b);
console.log(c);

let i = 10;
for(let i=0;i<3; i++) {
  console.log(i);
}

console.log(i);

let j=3;
{
  let j=13;
  {
    let j=23;
  }
}

const x = "x";
{
  const x = "y";
  {
    const x = "z";
    console.log(x);
  }
  console.log(x);
}
console.log(x);