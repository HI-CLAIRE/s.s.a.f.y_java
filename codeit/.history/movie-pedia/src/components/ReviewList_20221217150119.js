// reviewListItem 컴포넌트 만들기
function ReviewListItem({ item }) {

}

// map이라는 배열 메소드를 사용해서 각 요소 렌더링하기
function ReviewList({ items }) {
  return <ul>{items.map((item)=> {
    return <li>{item.title}</li>;
  })}</ul>;
}

export default ReviewList;