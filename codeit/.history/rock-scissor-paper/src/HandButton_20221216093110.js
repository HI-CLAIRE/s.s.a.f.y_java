import HandIcon from "./HandIcon";
import './HandButton.css';

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  const classNames = ``
  return (
    <button className={} onClick={handleClick}>
      <HandIcon value={value} />
    </button>
  );
}

export default HandButton;
