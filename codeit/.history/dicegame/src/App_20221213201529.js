import Board from "./Board";
import Button from "./Button";
import { useState } from "react";

function random(n) {
  return Math.ceil(Math.random() * n);
}

function App() {
  const [num, setNum] = useState(1);
  const [sum, setSum] = useState(0);
  const [gameHistory, setGameHistory] = useState([]);
  const [otherNum, setNum] = useState(1);
  const [sum, setSum] = useState(0);
  const [gameHistory, setGameHistory] = useState([]);

  // 버튼을 클릭할 때마다 발생하는 이벤트
  const handleRollClick = () => {
    const nextNum = random(6);
    setNum(nextNum);
    setSum(sum + nextNum);

    /* 
  배열이나 객체같은 참조형 state를 사용할 때에는 
  메소드나 할당 연산자로 값을 바꾸는 것이 아니라
  반드시 새로운 값을 만들어서 변경을 해야 한다.
  왜냐하면 주소값을 변하지 않은 채로 계속 참조만 하기 때문에
  */
    setGameHistory([...gameHistory, nextNum]);
  };

  // 초기화
  const handleClearClick = () => {
    setNum(1);
    setSum(0);
    setGameHistory([]);
  };

  return (
    <div>
      <div>
        <Button onClick={handleRollClick}>던지기</Button>
        <Button onClick={handleClearClick}>처음부터</Button>
      </div>
      <Board
        name="나"
        color="blue"
        num={num}
        sum={sum}
        gameHistory={gameHistory}
      />
      <Board name="상대" color="red" />
    </div>
  );
}

export default App;
