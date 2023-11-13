import React, { Component } from 'react';
import './App.css';
import { Routes, Route } from "react-router-dom";
import Main from './Components/public/Main';
import Header from './Components/public/Header';
import Footer from './Components/public/Footer';
import Detail from './Components/public/Detail';
import UserForm from './Components/public/UserForm';


class App extends Component {
  render() {
    return (
      <div>
        <Header />
        {/* <Main/> CAMBIAMOS A ROUTES PARA MANTENER EL HEADER Y EL FOOTER, CAMBIANDO EL MAIN POR EL DETAIL COMPONENT*/}
          <Routes>
            <Route exact path={"/"} Component={Main} />
            <Route path={"/details/:id"} Component={Detail} />
            <Route path={"/user-form"} Component={UserForm} />
          </Routes>
        <Footer />
      </div>
    );
  }
}

export default App;

















/* import logo from './logo.svg';
import './App.css';
import Main from './../../mascotapp/src/components/public/Main';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App; */
