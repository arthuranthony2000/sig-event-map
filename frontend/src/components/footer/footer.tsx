import './styles.css';
import { ReactComponent as Gitlogo } from '../../assets/github.svg';
import { ReactComponent as Instalogo } from '../../assets/instagram.svg';

function Footer(){
    return (
        <footer className="main-footer">
            App desenvolvido para a o curso de BSI
            <div className="footer-icons">
                <a href="https://github.com/batbeto" target="_new">
                    <Gitlogo />
                </a>
                <a href="https://github.com/arthuranthony2000" target="_new">
                    <Gitlogo />
                </a>
                <a className="instalogo" href="https://www.instagram.com/adalberto_maia/" target="_new">
                    <Instalogo />
                </a>
                <a className="instalogo" href="https://www.instagram.com/arthuranthony2000/" target="_new">
                    <Instalogo />
                </a>
                {new Date().toLocaleDateString()}
            </div>
        </footer>
    )
}


export default Footer;