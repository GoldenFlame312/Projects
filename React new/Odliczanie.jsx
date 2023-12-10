import React from "react";
import PropTypes from "prop-types";


const Odliczanie = props => (
    <div className="odliczanie">
        <strong>{props.name}</strong> {props.czas}
    </div>
);

Odliczanie.proTypes= {
    name: PropTypes.string,
    czas: PropTypes.string,
};
export default Odliczanie;