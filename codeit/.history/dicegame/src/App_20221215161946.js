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

    setMyHistory([...myHistory, nextMyNum]);
    setOtherHistory([...otherHistory, nextOtherNum]);
  };

  // 초기화
  const handleClearClick = () => {
    setMyHistory([]);
    setOtherHistory([]);
  };

  return (
    <div>
      <div>
        <Button color="blue" onClick={handleRollClick}>
          던지기
        </Button>
        <Button color="red" onClick={handleClearClick}>
          처음부터
        </Button>
      </div>
      <Board name="나" color="blue" gameHistory={myHistory} />
      <Board name="상대" color="red" gameHistory={otherHistory} />
    </div>
  );
}

export default App;
