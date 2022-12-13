import diceBlue01 from './assets/dice-blue-1.svg';
import diceBlue02 from ''
import diceRed01 from './assets/dice-red-1.svg';

const DICE_IMAGES = {
  blue: [
    diceBlue01,
    diceBlue02,
    diceBlue03,
    diceBlue04,
    diceBlue05,
    diceBlue06,
  ],
  red: [diceRed01, diceRed02, diceRed03, diceRed04, diceRed05, diceRed06],
};

function Dice(props) {
  const diceImg = props.color === 'red' ? diceRed01 : diceBlue01;
  return <img src={diceImg} alt="주사위" />;
}

export default Dice;
