const style ={
  padding: '14px 27px',
  border: 'solid 1px #7'
}

function Button({ children, onClick }) {
  return <button onClick={onClick}>{ children }</button>
}

export default Button;