import React from 'react'
import Footer from './Footer'
import {AddTodo,VisibleTodoList, UndoRedo} from '../containers'
import logo from "../logo.svg";
import '../App.css';


const App = () => (
    <div className="App">
        <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />

            <AddTodo />
        <VisibleTodoList />
        <Footer />
        <UndoRedo />
        </header>
    </div>
);

export default App