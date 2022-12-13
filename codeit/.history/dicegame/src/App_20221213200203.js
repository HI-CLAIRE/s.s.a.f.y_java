import Board from "./Board";
import Button from "./Button";

function App() {
  return (
    <div>
      <div>
        <Button onClick={handleRollClick}>던지기</Button>
        <Button onClick={handleClearClick}>처음부터</Button>
      </div>
      <Board name="나" color="blue" />
      <Board name="상대" color="red" />
    </div>
  );
}

export default App;