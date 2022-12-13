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

function random(n) {
  return Math.floor(Math.random() * n);
}

// HANDS 중
export function generateRandomHand() {
  const idx = random(HANDS.length);
  return HANDS[idx];
}