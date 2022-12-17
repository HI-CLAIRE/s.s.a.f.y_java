import ReviewList from "./ReviewList";
import items from '../mock.json';

function App() {
  const sortedItems = items.so

  return <div>
    <ReviewList items={items}/>
  </div>
}

export default App;