import HandIcon from "./HandIcon";
import './HandButton.css';

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return (
    <button className={HandButton} onClick={handleClick}>
      <HandIcon className={} value={value} />
    </button>
  );
}

export default HandButton;
