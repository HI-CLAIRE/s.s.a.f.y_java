// reviewListItem 컴포넌트 만들기
function ReviewListItem({})

function ReviewList({ items }) {
  return <ul>{items.map((item)=> {
    return <li>{item.title}</li>;
  })}</ul>;
}

export default ReviewList;