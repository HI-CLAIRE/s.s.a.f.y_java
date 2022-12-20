// 리퀘스트 함수를 모아서 사용

// fetch를 호출하고 받아온 response body를 리턴하는 함수
// 네트워크 request를 기다렸다가 response에서 json 함수를 호출하고
// json 
export async function getReviews() {
  const response = await fetch("https://learn.codeit.kr/api/film-reviews");
  const body = await response.json();
  return body;
}
