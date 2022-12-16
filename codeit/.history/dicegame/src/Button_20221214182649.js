const style ={
  padding: '1'
}

function Button({ children, onClick }) {
  return <button onClick={onClick}>{ children }</button>
}

export default Button;