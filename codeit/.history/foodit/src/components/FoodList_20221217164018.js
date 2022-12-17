function FoodListItem({ item, onDelete }) {
  const { imgUrl, title, calorie, content } = item;
  const handleDeleteClick

  return (
    <div>
      <img src={imgUrl} alt={title} />
      <div>{title}</div>
      <div>{calorie}</div>
      <div>{content}</div>
    </div>
  );
}

function FoodList({items, onDelete}) {
  console.log(items);
  return (
    <ul>
      {items.map((item) => {
        return (
          <li>
            <FoodListItem item={item} onDelete={onDelete}/>
          </li>
        );
      })}
    </ul>
  );
}

export default FoodList;