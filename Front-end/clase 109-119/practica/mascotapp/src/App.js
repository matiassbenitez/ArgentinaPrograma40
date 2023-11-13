import './App.css';
import Detail from './components/public/Detail';
import Footer from './components/public/Footer';
import Main from './components/public/Main';
import Navbar from './components/public/Navbar';
import { Routes, Route, BrowserRouter } from 'react-router-dom';
import UserForm from './components/public/UserForm';

function App() {
  return (
    <div>
      <Navbar />
        <Routes>
          <Route exact path={"/"} element={Main} />
          <Route path={"/details/:id"} element={Detail} />
          <Route path={"/user-form"} element={UserForm} />
        </Routes>
      //<Main />
      <Footer />
    </div>
  );
}

export default App;
