import React, { Component } from 'react';
import {BrowserRouter as Router, Route} from 'react-router-dom'
import logo from '../logo.svg';
import '../App.css';
import TodoForm from './TodoForm'
import TodoList from './TodoList'
import Message from './Message'
import Footer from './Footer'

class App extends Component {
    render() {
        return (
            <div className="App">
                <div className="App-header">
                    <img src={logo} className="App-logo" alt="logo" />
                    <h2>Welcome to Cloudbees Todos with Springboot</h2>
                </div>
                <Router>
                    <div className="Todo-App">
                        <Message />
                        <TodoForm />
                        <Route path='/:filter?' render={({match}) => (
                            <TodoList filter={match.params.filter} />
                        )} />
                        <Footer />
                    </div>
                </Router>
            </div>
        );
    }
}

export default App