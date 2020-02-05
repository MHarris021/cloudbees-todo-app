import React from 'react';
import {createStore} from "redux";
import { Provider } from "react-redux";
import reducer from './reducers';

import App from "./components/App";

const store = createStore(reducer);

function AppRedux() {
  return (
      <Provider store={store}>
        <App/>
      </Provider>
  );
}

export default AppRedux;
