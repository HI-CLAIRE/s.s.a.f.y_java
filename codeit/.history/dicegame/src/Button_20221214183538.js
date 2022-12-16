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

}

function Button({ children, onClick }) {
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
