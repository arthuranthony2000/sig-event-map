import './styles.css';
import { ReactComponent as Logo } from '../../assets/location_brasil.svg';
import Navbar from 'react-bootstrap/Navbar';


export default function Mainavbar(){
    
    return(
        <Navbar bg="dark" variant="dark" className="main-navbar">
            <Navbar.Brand >
                <Logo
                    width="30px"
                    height="30px"
                    className="d-inline-block align-top"
                />{' '}
                Sig Map
            </Navbar.Brand>
            <Navbar.Brand className="btn_position">
               ...
            </Navbar.Brand>
        </Navbar>
        
   
    )
}


