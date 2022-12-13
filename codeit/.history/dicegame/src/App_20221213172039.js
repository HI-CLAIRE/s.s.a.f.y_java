import Dice from './Dice';
import Button from './Button';
import { useState } from 'react';

function random(n) {
  return Math.ceil(Math.random() * n);
}

function App() {
const [num, setNum] = useState(1);
const [sum, setSum] = useState(0);
const [gameHistory, setGameHistory] = useState([]);

// 버튼을 클릭할 때마다 발생하는 이벤트
const handleRollClick = () => {
  const nextNum = random(6);
  setNum(nextNum);
  setSum(sum + nextNum);
  gameHistory.push(nextNum);
  set
};

// 초기화
const handleClearClick = () => {
  setNum(1);
  setSum(0);
}

  return (
    <div>
      <div>
        <Button onClick={handleRollClick}>던지기</Button>
        <Button onClick={handleClearClick}>처음부터</Button>
      </div>
      <div>
        <h2>나</h2>
        <Dice color="blue" num={num} />
        <h2>총점</h2>
        <p>{ sum }</p>
      </div>

    </div>
  );
}

export default App;
