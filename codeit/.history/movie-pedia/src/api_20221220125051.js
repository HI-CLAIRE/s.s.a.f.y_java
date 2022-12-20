// 리퀘스트 함수를 모아서 사용

// 
export async function getReviews() {
  const response = await fetch("https://learn.codeit.kr/api/film-reviews");
  const body = await response.json();
  return body;
}