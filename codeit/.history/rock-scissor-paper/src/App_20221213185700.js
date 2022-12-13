import Button from "./Button";
import HandButton from "./HandButton";
import HandIcon from "./HandIcon";
import { compareHand, generateRandomHand } from "./utils";
import { useState } from "react";

function getResult(me, other) {
  const comparison = compareHand(me, other);
  if (comparison > 0) return "승리";
  if (comparison < 0) return "패배";
  return "무승부";
}
const INITIAL_VALUE = "rock";

function App() {
  const [hand, setHand] = useState(INITIAL_VALUE);
  const [otherHand, setOtherHand] = useState(INITIAL_VALUE);
  const [gameHistory, setGameHistory] = useState([]); // 기록
  const [score, setScore] = useState(0); // 내 점수
  const [otherScore, setOtherScore] = useState(0); // 상대편 점수
  const [bet, setBet] = useState(1); // 베팅점수

  const handleButtonClick = (nextHand) => {
    const nextOtherHand = generateRandomHand();
    const nextHistoryItem = getResult(hand, otherHand);
    const comparison = compareHand(nextHand, nextOtherHand);

    setHand(nextHand);
    setOtherHand(nextOtherHand);
    setGameHistory([...gameHistory, nextHistoryItem]);
    if (comparison > 0) setScore(score + bet); // 내가 이겼을 때
    if (comparison < 0) setScore(otherScore + bet); // 상대가 이겼을 때
  };

  const handleClearClick = () => {
    setHand(INITIAL_VALUE);
    setOtherHand(INITIAL_VALUE);
    setGameHistory([]);
    setScore(0);
    setOtherScore(0);
    setBet(1);
  };

  // 베팅 핸들러 함수
  const handleBetChange = (e) => {
    const {value} = e.target;
    setBet(betScore);
    console.log(e.target);
  };

  return (
    <div>
      <Button onClick={handleClearClick}>처음부터</Button>
      <div>
        {score} : {otherScore}
      </div>
      <p>{getResult(hand, otherHand)}</p>
      <div>
        <HandIcon value={hand} />
        VS
        <HandIcon value={otherHand} />
      </div>
      <div>
        <input
          type="number"
          value={bet}
          min={1}
          max={9}
          onChange={handleBetChange}
        />
      </div>
      <div>
        <p>승부 기록: {gameHistory.join(", ")}</p>
      </div>
      <div>
        <HandButton value="rock" onClick={handleButtonClick} />
        <HandButton value="scissor" onClick={handleButtonClick} />
        <HandButton value="paper" onClick={handleButtonClick} />
      </div>
    </div>
  );
}

export default App;
