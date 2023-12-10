import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import Witaj from "./Witaj";

/*
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <Witaj></Witaj>
  </React.StrictMode>
);
*/

ReactDOM.render(
  <Witaj/>,
  document.getElementById('root')
)

