function formatDate(value) {
  const date = new Date(value);
  retrun `${date.getFullYear()}. `
}

// reviewListItem 컴포넌트 만들기
// 배열의 각 요소를 prop으로 내려주기
function ReviewListItem({ item }) {
  return (
    <div className="ReviewListItem">
      <img className="ReviewListItem-img" src={item.imgUrl} alt={item.title} />
      <div>
        <h1>{ item.title }</h1>
        <p>{ item.rating }</p>
        <p>{ formatDate(item.createdAt) }</p>
        <p>{ item.content }</p>
      </div>
    </div>
  )
}

// map이라는 배열 메소드를 사용해서 각 요소 렌더링하기
function ReviewList({ items }) {
  return <ul>{items.map((item)=> {
    return <li>{item.title}</li>;
  })}</ul>;
}

export default ReviewList;