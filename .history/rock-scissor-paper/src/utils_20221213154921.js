const HANDS = ['rock', 'scissor', 'paper'];

const WINS = {
  rock: 'scissor',
  scissor: 'paper',
  paper: 'rock'
};

// 두 개 비교
export function compareHand(a, b) {
  if(WINS[a] === b)
    return 1;
  if(WINS[b] === a)
    return -1;
  return 0;
}

function random(n) {
  return Math.floor(Math.random() * n);
}

// HANDS 중 random
export function generateRandomHand() {
  const idx = random(HANDS.length);
  return HANDS[idx];
}