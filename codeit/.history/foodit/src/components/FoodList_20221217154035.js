function FoodListItem({ item }) {
  const { imgUrl, title, calorie, content }

  return (
    <div>
      <img src={imgUrl} alt={title} />
    </div>
  )
}

function FoodList({items}) {
  return <ul></ul>
}

export default FoodList;