const style = {
  padding: "14px 27px",
  border: "solid 1px #7090ff",
  outline: "none",
  color: '#7090ff',
  cursor: 'pointer',
  backgroundColor
};

function Button({ children, onClick }) {
  return (
    <button style={style} onClick={onClick}>
      {children}
    </button>
  );
}

export default Button;
