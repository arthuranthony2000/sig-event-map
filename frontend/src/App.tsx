import { lazy } from 'react';

import './App.css';

const Navbar = lazy(() => import('./components/Navbar'));
const Home = lazy(() => import('./components/Home'));


function App() {
  return (
      <>
        <Navbar />
        <Home />  
      </>
  );
}

export default App;
