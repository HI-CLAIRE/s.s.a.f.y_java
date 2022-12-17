import FoodList from "./FoodList";
import mockItems from '../mock.json';
import {useState} from 'react';

function App() {
  const [items, setItem] = useState(mockItems);
  const [order, setOrder] = useState('createdAt');
  const sortedItems = items.sort((a, b) => b[order] - a[order]);

  // 최신순과 칼로리순
  const handleNewestClick = () => setOrder('createdAt');
  const handleCalorieClick = () => setOrder("calorie");
  
  // 삭제
  const handleDelete = (id) => {
    const nextItems = items.filter((item) => item.id !== id);
    setItem(nextItems)
  }

  return (
    <div>
      <div>
        <button onClick={handleNewestClick}>최신순</button>
        <button onClick={handleCalorieClick}>칼로리순</button>
      </div>
      <FoodList items={sortedItems} />
    </div>
  );
}

export default App;