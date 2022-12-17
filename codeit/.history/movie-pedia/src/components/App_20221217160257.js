import ReviewList from "./ReviewList";
import items from '../mock.json';

function App() {
  const sortedIte ms = items.sort()

  return <div>
    <ReviewList items={items}/>
  </div>
}

export default App;