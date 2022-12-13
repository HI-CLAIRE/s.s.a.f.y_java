import Dice from './Dice.js';
import Button from './Button.js';

function App() {
  return (
    <div>
      <div>
        <Button>던지기</Button>
        <Button></Button>
      </div>
      <Dice color="red" num={2} />
    </div>
  );
}

export default App;
