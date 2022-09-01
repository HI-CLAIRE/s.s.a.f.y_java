// 프라미스는 보통 함수의 형태로 만든다.
// 함수는 프라미스를 반환하는 함수.
// 함수의 이름을 프라미스의 이름으로 사용할 수 있고, 
// 함수에 매개변수를 같이 넣어서 호출하여서, 
// 프라미스 안에서 작업을 할 수도 있다.

function TaskOnePrimise() {
  return new Promise((resolve, reject) => {
    if(code === "1000") {
      resolve("socket connected.");
   }
   if(code === "4000") {
    reject("connection lost.");
   }
  })
}

function TaskTwoPromise() {
  return new Promise((resolve, reject) => {
    resolve(msg.toUpperCase());
  });
}

TaskOnePrimise("1000").then((response) => {
  console.log(response);
  return TaskTwoPromise(response);
}).then((response)=> {
  console.log(response);
});