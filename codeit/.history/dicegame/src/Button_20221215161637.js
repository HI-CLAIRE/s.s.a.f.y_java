import 

function Button({ color, children, onClick }) {
  const style = color === "red" ? redButtonStyle : blueButtonStyle;
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
