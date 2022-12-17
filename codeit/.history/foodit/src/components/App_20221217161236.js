import FoodList from "./FoodList";
import items from '../mock.json';
{use}

function App() {
  const [order, setOrder] = useState('createdAt');

  return (
    <div>
      <FoodList items={items} />
    </div>
  )
}

export default App;