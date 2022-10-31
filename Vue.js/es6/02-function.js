function a() {
  console.log("a");
};
a();

const b = function() {
  console.log("function b");
};
console.log(b);
b();

const c = function(i) {
  console.log(i);
  i = 'c';  // 매개변수 = let
  console.log(i);
};
c();

const d = function(i='d') {
  // this
  console.log(i);
};
d();

// 화살표 함수
// 1. funtion 키워드 쓰기 불편해서 사용
// 2. this가 달라진다.
const e = (d) => {
  // this (화살표일 때와 아닐 떄 차이가 발생할 수 있다.)
  console.log(d);
};

const add1 = (a,b) => {
  return a + b;
};

const add2 = (a,b=2) => a+b;

const add3 = (a=1, b=2) => a + b;

console.log(`add1 : ${add1(1,2)}`);
console.log(`add2 : ${add2(1)}`);
console.log(`add3 : ${add3()}`);

// Object에 Property로 넣기
const obj = {
  a: function() {
    console.log("obj.a() is called");
  },
  b() {
    console.log("obj.b() is called");
    let a = () => {console.log('a');}
  },
  c: () => {
    console.log("obj.c() is called");
  },
};

obj.a();
obj.b();
obj.c();