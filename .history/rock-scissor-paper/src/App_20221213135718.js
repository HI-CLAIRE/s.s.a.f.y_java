import Button from "./Button";
import HandButton from "./HandButton";

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
