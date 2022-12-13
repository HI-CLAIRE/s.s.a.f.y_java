import Dice from './Dice';
import Button from './Button';
import { useState } from 'react';

function random(n) {
  return Math.ceil(Math.random() * n);
}

function App() {
const [num, setNum] = useState(1);
const [sum, setSum] = useState(0);

// 버튼을 클릭할 때마다 발생하는 이벤트
const handleRollClick = () => {
  const nextNum = random(6);
  setNum(nextNum);
  setSum(sum + nextNum);
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
      <p></p>
      <Dice color="red" num={num} />
    </div>
  );
}

export default App;
