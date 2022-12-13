import HandIcon from "./HandIcon";

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return <button><HandIcon value={value} onClick={handleClick}/></button>;
}

export default HandButton;
