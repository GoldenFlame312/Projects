import React from "react";
import "./Edycja.css";

const EdycjaLekcji = props => {
    return(
        <div className="EdycjaLekcji">
            <div className="EdycjaLekcji__input-grupa">
        <input 
        placeholder="Nazwa"
        type="text"
        id="name"
        onChange={(e)=>props.onInputChange({[e.target.name]:e.target.value})}
/>
</div>
<div className="EdycjaLekcji__input-grupa">
    <input
    placeholder="Godzina"
    type="tel"
    id="czasG"
    name="czasG"
    onChange={(e)=>props.onInputChange({[e.target.name]:e.target.value})}
    />
    </div>
    <div className="EdycjaLekcji_input-grupa">
        <input
        
        placeholder="Minuta"
           type="tel"
           id="czasM"
           name="czasM"
        onChange={(e)=>props.onInputChange({[e.target.name]:e.target.value})}
       />
     
</div>
<div className="spacja">


            <button onClick={() => props.onSave()}>Ok</button>
            <button className="odlegloscPrzycisk">Cancel</button>
        </div>
        </div>
    );
};

export default EdycjaLekcji;