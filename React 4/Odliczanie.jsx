import React from "react";
import PropTypes from "prop-types";
import "./Odliczanie.css";


const Odliczanie = props => (
    <div className="odliczanie">
        <strong>{props.name}</strong> __ {props.czasG}:{props.czasM}
    </div>
);

Odliczanie.proTypes= {
    name: PropTypes.string,
    czasG: PropTypes.string,
    czasM: PropTypes.string
};
export default Odliczanie;