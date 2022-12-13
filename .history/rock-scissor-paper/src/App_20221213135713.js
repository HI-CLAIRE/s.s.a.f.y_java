import Button from "./Button";
import HandButton from "./HandButton";

function App() {
  const handleButtonClick = (value) => console.log(value);
  const handleClearClick = () => console.log("처음부터");
  return (
    <div>
      <Button onClick={handleClearClick}>처음부터</Button>
      <HandButton value="rock" onClick={handleClick} />
      <HandButton value="scissor" onClick={handleClick} />
      <HandButton value="paper" onClick={handleClick} />
    </div>
  );
}

export default App;
