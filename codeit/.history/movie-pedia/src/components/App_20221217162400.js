import ReviewList from "./ReviewList";
import items from '../mock.json';
import { useState } from 'react';

function App() {
  const [order, setOrder ] = useState('createdAt');
  const sortedItems = items.sort((a, b) => b[order] - a[order]);

  // 최신순과 베스트순
  const handleNewestClick = () => setOrder('createdAt');
  const handleBestClick = () => setOrder('rating');

  // 삭제
  // ㅑ
  const handleDelete = (id) => {

  }

  return (
    <div>
      <div>
        <button onClick={handleNewestClick}>최신순</button>
        <button onClick={handleBestClick}>베스트순</button>
      </div>
      <ReviewList items={sortedItems} />
    </div>
  );
}

export default App;