import FoodList from "./FoodList";
import items from '../mock.json';
import {useState} from 'react';

function App() {
  const [order, setOrder] = useState('createdAt');
  const sortedItems = items.sort((a, b) => b[order] - a[order]);

  const handleNewestClick = () => setOrder('createdAt');
  const handleCalorieClick = () => setOrder("calorie");

  return (
    <div>
      <div>
        <button onClick={handleNewestClick}>최신순</button>
        <button onClick={handleNewestClick}>최신순</button>
      </div>
      <FoodList items={items} />
    </div>
  );
}

export default App;