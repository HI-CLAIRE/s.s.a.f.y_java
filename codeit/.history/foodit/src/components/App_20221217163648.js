import FoodList from "./FoodList";
import mockItems from '../mock.json';
import {useState} from 'react';

function App() {
  const [order, setOrder] = useState('createdAt');
  const sortedItems = items.sort((a, b) => b[order] - a[order]);

  // 최신순과 칼로리순
  const handleNewestClick = () => setOrder('createdAt');
  const handleCalorieClick = () => setOrder("calorie");
  
  // 삭제
  const handleDelete = (id) => {

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