import Button from "./Button";
import HandButton from "./HandButton";
import { compareHand } from "./utils";

function getResult(me, other) {
  const comparison = compareHand(me, other);
  if(comparison > 0)
    return '승리';
  if(comparison < 0)
    return '패배';
  return '무승부';
}

function App() {
  const hand = 'rock';
  const otherHand = 'scissor';

  const handleButtonClick = (nextHand) => {

  };

  const handleClearClick = () => {

  };

  return(
    <div>
      <Button onClick={handleClearClick}>처음부터</Button>
      <p>{ getResult(hand, otherHand) }</p>
      <div>
        <HAND
      </div>
    </div>
  )
}

export default App;
