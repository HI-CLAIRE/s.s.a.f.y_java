const style ={
  padding: '14px 27px'
}

function Button({ children, onClick }) {
  return <button onClick={onClick}>{ children }</button>
}

export default Button;