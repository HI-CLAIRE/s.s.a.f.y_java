import Dice from "./Dice";

function Board({ name, color, gameHistory }) {
  const num = gameHistory[gameHistory.length]


  return (
    <div>
      <h2>{name}</h2>
      <Dice color={color} num={num} />
      <h2>총점</h2>
      <p>{sum}</p>
      <h2>기록</h2>
      <p>{gameHistory.join(', ')}</p>
    </div>
  );
}

export default Board;
