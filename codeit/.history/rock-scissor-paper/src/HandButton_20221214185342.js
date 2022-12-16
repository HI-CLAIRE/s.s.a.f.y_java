import HandIcon from "./HandIcon";

const stylt = {
  width: '166px',
  height: '166px',
  border: 'none',
  outline: 'none',
  text-align: 'center',
  cursor: pointer,
  background-color: 'transparent',
  background-image: url('./assets/purple.svg'),
  background-repeat: 'no-repeat',
  background-position: center,
  background-size: contain,
}

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return (
    <button onClick={handleClick}>
      <HandIcon value={value} />
    </button>
  );
}

export default HandButton;
