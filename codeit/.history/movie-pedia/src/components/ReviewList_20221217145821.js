function ReviewList({ items }) {
  return <ul>{items.map((item)=> {
    return <li>{item.}</li>
  })}</ul>;
}

export default ReviewList;