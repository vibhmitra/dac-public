import logo from './logo.svg';
import './App.css';
import React from 'react';

import Header from './components/Header';
import Footer from './components/footer';
import HomeScreen from './screens/HomeScreen';

function App() {
  return (
    <React.Fragment>
      <Header />
      <main className='py-3 m-4'>
        <HomeScreen />
      </main>
      <Footer />
    </React.Fragment>
  );
}

export default App;
