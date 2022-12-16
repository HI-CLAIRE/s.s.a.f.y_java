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
  border: "solid 1px #7090ff",

  color: "#7090ff",

  backgroundColor: "rgba(0, 89, 255, 0.2)",
};

function Button({ children, onClick }) {
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
