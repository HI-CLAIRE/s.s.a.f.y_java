function TaskHasDuration(duration) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      // 이 작업을 
      resolve(duration);
    }, duration); // duration 경과하면 수행
  })
}

// TaskHasDuration(1000).then((message)=> {
//   console.log(message);
// });
// TaskHasDuration(1001).then((message)=> {
//   console.log(message);
// });

TaskHasDuration(1000)
  .then((message)=> {
    console.log(message);
    return TaskHasDuration(1001);
  })
  .then((message)=> {
    console.log(message);
  });

Promise.all([
  TaskHasDuration(1000), //task1
  TaskHasDuration(2000), //task2
  TaskHasDuration(3000), //task3
  TaskHasDuration(4000), //task4
  TaskHasDuration(5000), //task5
]).then((message) => {
  // task 1, 2, 3, 4, 5에 모두 의존하는 작업을
  // 여기서 수행
  console.log(message);
});