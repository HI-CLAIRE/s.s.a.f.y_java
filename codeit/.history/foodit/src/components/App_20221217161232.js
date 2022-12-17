import FoodList from "./FoodList";
import items from '../mock.json';
im

function App() {
  const [order, setOrder] = useState('createdAt');

  return (
    <div>
      <FoodList items={items} />
    </div>
  )
}

export default App;