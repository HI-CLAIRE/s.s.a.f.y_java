// // 1. const / let

// function test_1() {
//     let x = "let";
//     {
//         let x = "const";

//         // x 출력
//         if (x === "const") {
//             console.log("I am " + x);
//         }

//         x = "changed";
//     }
//     // x 출력
//     if (x === "let") {
//         console.log("I am " + x);
//     }
// }
// test_1();

// // 2. template string
// function test_2() {
//     const id = "IronMan";
//     const password = "1234";
//     const name = "토니 스타크";
//     const email = "ironman@ssafy.com";
//     const age = 53;

//     // 아래 빈칸을 채워넣으시오.
//     let userString = `아이디 : ${id} , 비밀번호 : ${password} , 이름 : ${name} , 이메일 : ${email} , 나이 : ${age}`;
//     console.log(userString);
// }

// test_2();

// 3. arrow function / this

let a = 30;
let b = 40;

function test_3() {
    a = 10;
    b = 20;

    let max = (a, b) => (a > b ? a : b);
    console.log("hi" + max());

    let min = function () {
        return a < b ? a : b;
    };
    console.log(min());
}

test_3();

// // 4. destructuring , rest

// function test_4() {
//     let { ___, ___, ______ } = { a: 10, b: 20, c: 30, d: 40 };
//     console.log(____);
//     console.log(____);
//     console.log(____);
// }

// test_4();

// // 5. Number, Math, String

// function test_5() {
//     // 정수인가?
//     console.log(Number._______("imInteger"));
//     // Number 타입이면서 NaN인가?
//     console.log(Number._______(____));

//     // 최소값
//     console.log(Math.____(40, 50, 60));
//     // 2의 3승
//     console.log(Math.____(2, 3));
//     // 1 - 100 의 절대값
//     console.log(Math.____(1 - 100));

//     // 문자열이 다음 문자열을 포함하는가?
//     console.log("abcde".________("abc"));
//     // 문자열 3번 반복하여 출력
//     console.log("abc"._____(3));
// }

// test_5();

