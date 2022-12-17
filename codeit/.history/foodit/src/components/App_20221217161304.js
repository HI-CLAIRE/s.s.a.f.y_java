import FoodList from "./FoodList";
import items from '../mock.json';
import {useState} from 'react';

function App() {
  const [order, setOrder] = useState('createdAt');
  const 

  return (
    <div>
      <FoodList items={items} />
    </div>
  )
}

export default App;