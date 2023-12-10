import React from "react";
import PropTypes from 'prop-types';
import "./Odliczanie.css";

const Odliczanie = props => (
    <div className="odliczanie">
        <span>{props.name} </span> - {props.czasG}:{props.czasM}
    </div>
)

Odliczanie.propTypes = {
    name: PropTypes.string,
    czasM: PropTypes.string,
    czasG: PropTypes.string
}

export default Odliczanie