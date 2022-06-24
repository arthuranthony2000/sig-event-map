import { lazy } from 'react';

import './App.css';

const Home = lazy(() => import('./components/Home'));
const Navbar = lazy(() => import('./components/Navbar'));

function App() {
  return (
      <>
        <Navbar />
        <Home />  
      </>
  );
}

export default App;
