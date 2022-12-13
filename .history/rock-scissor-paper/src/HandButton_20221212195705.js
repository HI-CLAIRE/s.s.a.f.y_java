import HandIcon from "./HandIcon";

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return <button><HandIcon value={value} onCliclk/></button>;
}

export default HandButton;
