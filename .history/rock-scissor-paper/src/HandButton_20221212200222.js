import HandIcon from "./HandIcon";

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return (
    <button o>
      <HandIcon value={value} onClick={handleClick} />
    </button>
  );
}

export default HandButton;
