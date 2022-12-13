import Dice from './Dice';
import Button from './Button';
import { useState }

function App() {
const [num, setNum] = useState(1);

  return (
    <div>
      <div>
        <Button>던지기</Button>
        <Button>처음부터</Button>
      </div>
      <Dice color="red" num={2} />
    </div>
  );
}

export default App;
