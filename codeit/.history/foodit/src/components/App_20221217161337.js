import FoodList from "./FoodList";
import items from '../mock.json';
import {useState} from 'react';

function App() {
  const [order, setOrder] = useState('createdAt');
  const sortedItems = items.sort((a, b) => b[order] - a[order]);

  const 

  return (
    <div>
      <FoodList items={items} />
    </div>
  )
}

export default App;