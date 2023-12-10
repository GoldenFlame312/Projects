import React from "react";
import "./Edycja.css";

const EdycjaLekcji = props => {
    return(
        <div className="EdycjaLekcji">
            <div className="EdycjaLekcji__input-grupa">
                <label htmlFor="poleTekstowe">Podaj nazwę</label>
                <input type="text" name="name" id="name "
                onChange={(e) => props.onInputChange({[e.target.name]: e.target.value})} />
            </div>
            <div className="EdycjaLekcji__input-grupa">
                <label htmlFor="czasG">Podaj godzinę</label>
                <input type="tel" name="czasG" id="czasG" 
                onChange={(e) => props.onInputChange({[e.target.name]: e.target.value})}/>
            </div>
            <div className="EdycjaLekcji__input-grupa">
                <label htmlFor="czasM">Podaj godzinę</label>
                <input type="tel" name="czasM" id="czasM" 
                onChange={(e) => props.onInputChange({[e.target.name]: e.target.value})}/>
            </div>
            <button onClick={() => props.onSave()}>Ok</button>
            <button>Cancel</button>
        </div>
    )
}

export default EdycjaLekcji