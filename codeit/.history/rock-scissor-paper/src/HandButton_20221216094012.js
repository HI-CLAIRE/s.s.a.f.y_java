import HandIcon from "./HandIcon";
import './'

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  const classNames = `HandButton`
  return (
    <button className={classNames} onClick={handleClick}>
      <HandIcon value={value} />
    </button>
  );
}

export default HandButton;
