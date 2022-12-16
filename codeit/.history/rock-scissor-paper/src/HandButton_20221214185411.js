import HandIcon from "./HandIcon";

const stylt = {
  width: '166px',
  height: '166px',
  border: 'none',
  outline: 'none',
  textAlign: 'center',
  cursor: 'pointer',
  backgroundColor: 'transparent',
  backgroundImage: url('./assets/purple.svg'),
  backgroundRepeat: 'no-repeat',
  backgroundPosition: 'center',
  background-size: 'contain',
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
