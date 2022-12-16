const style ={
  padding: '14px 27px',
  border: 'solid 1'
}

function Button({ children, onClick }) {
  return <button onClick={onClick}>{ children }</button>
}

export default Button;