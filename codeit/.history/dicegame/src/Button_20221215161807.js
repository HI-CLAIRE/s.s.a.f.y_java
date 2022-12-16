import './Button.css';

function Button({ color, children, onClick }) {
  const classNames = `Button ${color}`;
  return (
    <button className={classNames} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
