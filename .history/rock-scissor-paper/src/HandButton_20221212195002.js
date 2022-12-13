function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return <button>여기에 HandIcon을 배치해주세요</button>;
}

export default HandButton;
