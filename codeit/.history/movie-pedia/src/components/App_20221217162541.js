import ReviewList from "./ReviewList";
import mockItems from '../mock.json';
import { useState } from 'react';

function App() {
  const [order, setOrder ] = useState('createdAt');
  const sortedItems = items.sort((a, b) => b[order] - a[order]);

  // 최신순과 베스트순
  const handleNewestClick = () => setOrder('createdAt');
  const handleBestClick = () => setOrder('rating');

  // 삭제
  // id를 파라미터로 받아서 해당 id를 가진 요소를 filter로 걸러냄
  // 새로운 배열값을 리액트가 재렌더링하면 화면에 반영이 됨
  const handleDelete = (id) => {
    const nextItems = items.filter((item) => item.id !== id);
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