// 1
let name = "Gyuyeon";
let birthday = "1996.09.03";
let job = "Student";

let info = `내 이름은 ${name}이고, ${birthday}에 태어 났습니다. 제 직업은 ${job}입니다.`;
console.log(info);

// 2
const Movie = {
    title: "기생충",
    director: "봉준호",
    genre: "드라마",
    runningTime: 123
};

console.log(Movie);

// 3
const Movies = ["기생충", "이터널스", "킹스맨", "스파이더맨", "해리포터"];
Movies.forEach((movie) => console.log(movie));

// 4
let input = prompt;
console.log(Math.pow(Math.pow(input)));