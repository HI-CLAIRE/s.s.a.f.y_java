imp

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return <button><HandIcon /></button>;
}

export default HandButton;
