import HandIcon from "./HandIcon";

function HandButton({ value, onClick }) {
  const handleClick = (value) => onClick(value);
  return (
    <button>
      <HandIcon value={value} onClick={handleClick} />
    </button>
  );
}

export default HandButton;
