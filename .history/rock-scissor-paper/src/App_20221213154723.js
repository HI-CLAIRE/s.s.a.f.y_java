import Button from "./Button";
import HandButton from "./HandButton";
import { compareHand } from "./utils";

function getResult(me, other) {
  const comparison = compareHand(me, other);
  if(comparison > 0)
    return '승리';
  if()
}

function App() {
  const handleButtonClick = (value) => console.log(value);
  const handleClearClick = () => console.log("처음부터");
  return (
    <div>
      <Button onClick={handleClearClick}>처음부터</Button>
      <HandButton value="rock" onClick={handleButtonClick} />
      <HandButton value="scissor" onClick={handleButtonClick} />
      <HandButton value="paper" onClick={handleButtonClick} />
    </div>
  );
}

export default App;
