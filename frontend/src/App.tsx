import './App.css';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import t from 'prop-types';
import { Navigate ,Route, Routes } from "react-router-dom";
import { useContext, useEffect ,lazy, Suspense, useState} from 'react';
import LinearProgress from '@material-ui/core/LinearProgress';
import firebase from './services/firebase';
import { AuthContext } from './services/auth';
import AuthProvider from './services/auth';
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

  const PrivateRoute = ({component: Component ,...rest}: any) => (
    <Route {...rest} render={(props: any) => (
      isUserLoggedIn ? (<Component {...props} />) : 
      (<Navigate to="/" state={{from: props.location}} replace/>)
    )}/>  
  )  
  

  return (
    <Suspense fallback={<LinearProgress />}>
      <Navbar />  
      <Routes>
        <Route path='/' element={<Home />} />
      </Routes>
      <ToastContainer />
    </Suspense>
    
  )
}

App.propTypes = {
  location: t.object.isRequired
}

export default App;
