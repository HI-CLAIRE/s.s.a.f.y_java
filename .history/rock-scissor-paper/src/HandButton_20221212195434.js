function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return <button><HandIcon></HandIcon>></button>;
}

export default HandButton;
