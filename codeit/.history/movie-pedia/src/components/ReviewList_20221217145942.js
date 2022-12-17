

function ReviewList({ items }) {
  return <ul>{items.map((item)=> {
    return <li>{item.title}</li>;
  })}</ul>;
}

export default ReviewList;