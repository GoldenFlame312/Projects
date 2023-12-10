import React, {Component} from 'react' //imporotwanie biblioteki React
import Odliczanie from './Odliczanie';
import EdycjaLekcji from './Edycja';
class Powitanie extends Component{
    constructor(){
        super();
        this.state = {
            Lekcje: [
                {id:0, name:"Lecja 1", czas: "07:45"},
                {id:1, name:"Lecja 2", czas: "08:35"},
                {id:2, name:"Lecja 3", czas: "09:25"},
                {id:3, name:"Lecja 4", czas: "10:15"},
                {id:4, name:"Lecja 5", czas: "11:15"},
                {id:5, name:"Lecja 6", czas: "12:15"},
            ]
        }
    }
    dodanieLekcji(val) {
        
    }
    render(){
        const Lekcje = this.state.Lekcje.map(element => {
            return <Odliczanie name={element.name} czas={element.czas}/>
        }) //funkcja map przechodzi po każdym elemencie tablicy
        return(
            <div className='EdycjaLekcji'>
                {Lekcje}
                <EdycjaLekcji onInputChange = {val => this.dodanieLekcji(val)}/>
            </div>
        );
    }
}

export default Powitanie;