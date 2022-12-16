import HandIcon from "./HandIcon";

const style = {
  width: "166px",
  height: "166px",
  border: "none",
  outline: "none",
  textAlign: "center",
  cursor: "pointer",
  backgroundColor: "transparent",
  backgroundImage: "./assets/purple.svg",
  backgroundRepeat: "no-repeat",
  backgroundPosition: "center",
  backgroundSize: "contain",
};

function HandButton({ value, onClick }) {
  const handleClick = () => onClick(value);
  return (
    <button onClick={handleClick}>
      <HandIcon value={value} />
    </button>
  );
}

export default HandButton;
