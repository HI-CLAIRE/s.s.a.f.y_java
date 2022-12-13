import Button from "./Button";
import HandButton from "./HandButton";
import HandIcon from "./HandIcon";
import { compareHand } from "./utils";
import { useState } from "react";

function getResult(me, other) {
  const comparison = compareHand(me, other);
  if(comparison > 0)
    return '승리';
  if(comparison < 0)
    return '패배';
  return '무승부';
}

function App() {
  const [hand, setHand] = useState('rock');
  const [otherHand, setOtherHand] = useState('rock');

  const handleButtonClick = (nextHand) => {
    nextHand(setHand);
    otherHand = gen
  };

  const handleClearClick = () => {
    setHand('rock');
    setOtherHand('rock');
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
    </div>
  );
}

export default App;
