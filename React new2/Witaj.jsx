import React, {Component} from "react";
import Odliczanie from "./Odliczanie";
import EdycjaLekcji from "./Edycja";
import "./Witaj.css";

class Powitanie extends Component {
    constructor() {
        super()
        this.state = {
            Lekcje: [
                {id: 0, name:"Lekcja 1", czasG:"07", czasM:"45"},
                {id: 1, name:"Lekcja 2", czasG:"08", czasM:"35"},
                {id: 2, name:"Lekcja 3", czasG:"09", czasM:"25"},
                {id: 3, name:"Lekcja 4", czasG:"10", czasM:"15"},
                {id: 4, name:"Lekcja 5", czasG:"11", czasM:"15"},
                {id: 5, name:"Lekcja 6", czasG:"12", czasM:"15"}
            ],
            edytowaneLekcje: {
                id: "99",
                name: "",
                czasG: "",
                czasM: ""
            }
        }
        this.dodanieLekcji = this.dodanieLekcji.bind(this);
        this.zapisanieLekcji = this.zapisanieLekcji.bind(this);
    }

    dodanieLekcji(val) {
        this.setState(prevState => {
            return{
                edytowaneLekcje: Object.assign(prevState.edytowaneLekcje, val)
            }
        })
    }

    zapisanieLekcji() {
        this.setState(prevState => ({
            Lekcje: [...prevState.Lekcje, prevState.edytowaneLekcje],
            edytowaneLekcje: {
                id: "",
                name: "",
                czasG: "",
                czasM: ""
            }
        }))
    }

    render() {
        const Lekcje = this.state.Lekcje.map(element => {
            return <Odliczanie key={element.id} name={element.name} czasG={element.czasG} czasM={element.czasM}/>
        })
        return (
            <div className="EdycjaLekcji">
                {Lekcje}
                <EdycjaLekcji
                    onInputChange = {
                        val => this.dodanieLekcji(val)}
                        onSave={() => this.zapisanieLekcji()}
                    />
            </div>
        )
    }
}

export default Powitanie    