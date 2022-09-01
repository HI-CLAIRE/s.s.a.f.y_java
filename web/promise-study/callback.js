

// callback
// 1. 함수를 파라미터로 넘겨줌
// 2. 제대로 동작했다면 callback을 불러줘.
// 3. 나중에 에러가 생기면 errorCallback을 불러줘.
function checkCatStatus(callback, errorCallback) {
  let isHungry = true;
  let isThirsty = false;

  if(!isHungry && !isThirsty) {
    callback();
  }
  if(isThirsty && isHungry) {
    errorCallback("very unhappy.");
  }
  if(isHungry) {
    errorCallback("hungry.");
  }
  if(isThirsty) {
    errorCallback("thirsty.");
  }
}

checkCatStatus(
  (message) => {
    console.log("Cat is happy.")
  }, (error) => {
    console.log(`Cat is unhappy. ${error}`)
  }
)