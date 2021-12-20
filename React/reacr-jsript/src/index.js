import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { ThemeProvider } from '@mui/material';
import { theme } from './theme';
import {
  BrowserRouter as Router,
  Routes,
  Route,
} from "react-router-dom";
import {Provider} from 'react-redux'
import  Store  from './components/poc/Store';
import BookPages from './components/organisms/BookPages/BookPages';

ReactDOM.render(
  <Router>
  <Provider store={Store}>
  <ThemeProvider theme={theme}>
    
    <Routes>

    < Route path="/" element={<App/>} />
    < Route path="/The%20Grid" element={<BookPages bookId={0}/>} />
    < Route path="/Rogue%20Waves" element={<BookPages bookId={1}/>} />
    < Route path="/The%20Whole-Brain%20Child" element={<BookPages bookId={1}/>} />

    </Routes>
  
  </ThemeProvider>
  </Provider>
  </Router>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
