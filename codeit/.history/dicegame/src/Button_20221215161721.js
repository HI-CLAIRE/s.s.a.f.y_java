import './Button.css';

function Button({ color, children, onClick }) {
  const classNames = `Button ${}`
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
