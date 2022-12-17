import ReviewList from "./ReviewList";
import items from '../mock.json';

function App() {
  const [order, setOrder ] = useState('createdAt')
  const sortedItems = items.sort((a, b) => b.rating - a.rating);

  return (
    <div>
      <ReviewList items={sortedItems} />
    </div>
  );
}

export default App;