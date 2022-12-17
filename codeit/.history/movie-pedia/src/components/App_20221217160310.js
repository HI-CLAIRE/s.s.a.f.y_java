import ReviewList from "./ReviewList";
import items from '../mock.json';

function App() {
  const sortedItems = items.sort((a, b) => b.rating - a.rating)

  return <div>
    <ReviewList items={items}/>
  </div>
}

export default App;