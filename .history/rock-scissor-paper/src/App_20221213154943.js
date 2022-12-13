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
  const hand = ''
}

export default App;
