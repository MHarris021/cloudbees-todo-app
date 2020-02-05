import React from 'react';
import { Provider } from "react-redux";


import App from "./components/App";

import store from "./store";

function AppRedux() {
  return (
      <Provider store={store}>
        <App/>
      </Provider>
  );
}

export default AppRedux;
