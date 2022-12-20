// 리퀘스트 함수를 모아서 사용

// fetch를 호출하고 받아온 response body를 리턴하는 함수
// 네트워크 request를 기다렸다가 response에서 json 함수를 호출하고
// json 변환이 끝나면 body를 리턴
// async 함수를 사용했으므로 getReviews 함수는 비동기함수
export async function getReviews() {
  const response = await fetch("https://learn.codeit.kr/1580/film-reviews");
  const body = await response.json();
  return body;
}
