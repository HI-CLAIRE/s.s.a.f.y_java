import Board from "./Board";
import Button from "./Button";
import { useState } from "react";

function random(n) {
  return Math.ceil(Math.random() * n);
}

function App() {
  const [myHistory, setMyHistory] = useState([]);
  const [otherHistory, setOtherHistory] = useState([]);
  

  // 버튼을 클릭할 때마다 발생하는 이벤트
  const handleRollClick = () => {
    const nextMyNum = random(6);
    const nextOtherNum = random(6);

    setMyHistory([..myHistory, nextMyNum]);
  };

  // 초기화
  const handleClearClick = () => {
    setNum(1);
    setSum(0);
    setGameHistory([]);
    setOtherNum(1);
    setOtherSum(0);
    setOtherGameHistory([]);
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
      <Board
        name="상대"
        color="red"
        num={otherNum}
        sum={otherSum}
        gameHistory={otherGameHistory}
      />
    </div>
  );
}

export default App;
