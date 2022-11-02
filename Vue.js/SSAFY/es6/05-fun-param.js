let fun = function (...a) {
  console.log(a);
};

fun();
fun(1);
fun(1, 2);
fun(1, 2, 3);

fun = (a, b, ...c) => {
  console.log(a);
  console.log(b);
  console.log(c);
};

fun();
fun(1);
fun(1, 2);
fun(1, 2, 3);

fun = (a, b, ...c) => (a+b) * c.length;
console.log(fun(1,2,3,4,5));

