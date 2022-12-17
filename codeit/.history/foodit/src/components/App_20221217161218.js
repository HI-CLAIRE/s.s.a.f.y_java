import FoodList from "./FoodList";
import items from '../mock.json';

function App() {
  const [order, setOrder] = useState

  return (
    <div>
      <FoodList items={items} />
    </div>
  )
}

export default App;