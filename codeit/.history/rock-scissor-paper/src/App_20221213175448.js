import Button from "./Button";
import HandButton from "./HandButton";
import HandIcon from "./HandIcon";
import { compareHand, generateRandomHand } from "./utils";
import { useState } from "react";

function getResult(me, other) {
  const comparison = compareHand(me, other);
  if(comparison > 0)
    return '승리';
  if(comparison < 0)
    return '패배';
  return '무승부';
}
const INITIAL_VALUE = "rock";

function App() {
  const [hand, setHand] = useState(INITIAL_VALUE);
  const [otherHand, setOtherHand] = useState(INITIAL_VALUE);
  const [gameHistory, setGameHistory] = useState([]); // 기록
  const [score, setScore] = useState(0);  // 내 점수
  const [otherScore, setOtherScore] = useState(0); // 상대편 점수
  const [bet, setBet] = useState(1); // 베팅점수

  const handleButtonClick = (nextHand) => {
    const nextOtherHand = generateRandomHand();
    const nextHistoryItem = getResult(hand, otherHand);
    const comparison = compareHand(nextHand, nextOtherHand);
    
    setHand(nextHand);
    setOtherHand(nextOtherHand);
    setGameHistory([...gameHistory, nextHistoryItem]);
    
  };

  const handleClearClick = () => {
    setHand(INITIAL_VALUE);
    setOtherHand(INITIAL_VALUE);
    setGameHistory([]);
  };

  return (
    <div>
      <Button onClick={handleClearClick}>처음부터</Button>
      <p>{getResult(hand, otherHand)}</p>
      <div>
        <HandIcon value={hand} />
        VS
        <HandIcon value={otherHand} />
      </div>
      <div>
        <HandButton value="rock" onClick={handleButtonClick} />
        <HandButton value="scissor" onClick={handleButtonClick} />
        <HandButton value="paper" onClick={handleButtonClick} />
      </div>
      <div>
        <p>승부 기록: { gameHistory.join(', ') }</p>
      </div>
    </div>
  );
}

export default App;
