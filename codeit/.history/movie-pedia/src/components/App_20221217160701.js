import ReviewList from "./ReviewList";
import items from '../mock.json';
import { useState } from 'react';

function App() {
  const [order, setOrder ] = useState('createdAt');
  const sortedItems = items.sort((a, b) => b[order] - a[order]);

  const handleNew

  return (
    <div>
      <ReviewList items={sortedItems} />
    </div>
  );
}

export default App;