const style = {
  
  border: "solid 1px #7090ff",
  outline: "none",
  color: '#7090ff',
  cursor: 'pointer',
  backgroundColor: 'rgba(0, 89, 255, 0.2)',
  borderRadius: '30px',
  fontSize: '17px',
};

const baseButtonStyle = {
  padding: "14px 27px",
  
};

function Button({ children, onClick }) {
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
