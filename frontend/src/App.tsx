import { useContext, useEffect ,lazy, useState} from 'react';
import firebase from './services/firebase';
import { AuthContext } from './services/auth';
import LinearProgress from '@material-ui/core/LinearProgress';

import './App.css';

const Navbar = lazy(() => import('./components/Navbar'));
const Home = lazy(() => import('./components/Home'));


function App() {
  const { userInfo, setUserInfo } = useContext(AuthContext)
  const [ checkUserIn, setCheckUserIn ] =useState(false)
  const { isUserLoggedIn } = userInfo;

  useEffect(() => {
    firebase.auth().onAuthStateChanged((user)=> {  
      setUserInfo({
        isUserLoggedIn: !!user,
        user
      })
      setCheckUserIn(true)
    })
  }, [setUserInfo]);

  
  if (!checkUserIn) return <LinearProgress />
  
  return (
      <>
        <Navbar />
        <Home />  
      </>
  );
}

export default App;
