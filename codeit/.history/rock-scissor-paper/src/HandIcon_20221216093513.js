import rockImg from "./assets/rock.svg";
import scissorImg from "./assets/scissor.svg";
import paperImg from "./assets/paper.svg";
import './HandButton.css';

const IMAGES = {
  rock: rockImg,
  scissor: scissorImg,
  paper: paperImg,
}

function HandIcon({ value }) {
  const src = IMAGES[value];
  const  = `HandButton`;
  return <img className={classNames} src={src} alt={value} />;
}

export default HandIcon;
