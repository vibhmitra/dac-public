import './App.css';
import React from 'react';

import Header from './components/Header';
import Footer from './components/footer';
import { Outlet } from 'react-router-dom';
import { Container } from 'react-bootstrap';

const App = () => {
  return (
    <React.Fragment>
          <Header />
          <Container>
        <main className='py-3 m-4'>
            <Outlet />
        </main>
      </Container>
	  <Footer/>
    </React.Fragment >
  );
}

export default App;
