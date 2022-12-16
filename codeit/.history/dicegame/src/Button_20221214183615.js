const style = {
  
  
  
};

const baseButtonStyle = {
  padding: "14px 27px",
  outline: "none",
  cursor: "pointer",
  borderRadius: "30px",
  fontSize: "17px",
};

const blueButtonStyle = {
  ...baseButtonStyle,
  backgroundColor: "rgba(0, 89, 255, 0.2)",
  border: "solid 1px #7090ff",
  color: "#7090ff",
};

const blueButtonStyle = {
  ...baseButtonStyle,
  backgroundColor: "rgba(0, 89, 255, 0.2)",
  border: "solid 1px #7090ff",
  color: "#7090ff",
};

function Button({ children, onClick }) {
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
