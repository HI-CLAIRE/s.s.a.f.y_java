import Button from "./Button";
import HandButton from "./HandButton";

function App() {
  const handleClick = (value) => console.log(value);
  return (
    <div>
      <Button>처음부터</Button>
      <HandButton value="rock" onClick={handleClick} />
      <HandButton value="scissor" onClick={handleClick} />
      <HandButton value="paper" onClick={handleClick} />
    </div>
  );
}

export default App;
