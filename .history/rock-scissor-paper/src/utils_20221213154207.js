const HANDS = ['rock', 'scissor', 'paper'];

const WINS = {
  rock: 'scissor',
  scissor: 'paper',
  paper: 'rock'
};

export function compareHand(a, b) {
  if(WINS[a] === b)
    return 1;
  if(WIMS[b] === a)
    return -1;
  return 0;
}

f