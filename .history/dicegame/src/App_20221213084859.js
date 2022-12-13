import Dice from './Dice.js';
import Button from './Button.js';

function App() {
  return (
    <div>
      <div>
        <Button value="던지기"/>
      </div>
      <Dice color="red" num={2} />
    </div>
  );
}

export default App;
