const baseButtonStyle = {
  padding: "14px 27px",
  outline: "none",
  cursor: "pointer",
  borderRadius: "9999px",
  fontSize: "17px",
};

const blueButtonStyle = {
  ...baseButtonStyle,
  border: "solid 1px #7090ff",
  color: "#7090ff",
  backgroundColor: "rgba(0, 89, 255, 0.2)",
};

const redButtonStyle = {
  ...baseButtonStyle,
  border: "solid 1px #ff4664",
  color: "#ff4664",
  backgroundColor: "rgba(255, 78, 78, 0.2)",
};

function Button({ color, children, onClick }) {
  const style = color === "red" ? redButtonStyle : blueButtonStyle;
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
