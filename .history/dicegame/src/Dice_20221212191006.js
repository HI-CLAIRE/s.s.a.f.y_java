import diceBlue01 from './assets/dice-blue-1.svg';
import diceRed01 from './assets/dice-red-1.svg';

function Dice(props) {
  const diceImg = props.color === 'red' ? diceRed01 : diceBlue01;
  return <img src={diceImg} alt="주사위" />;
}

export default Dice;
