import React, { Component } from "react";
import "../Pearson.css";
import OutPut from "./OutPut";
import PearsonForm from "./PearsonForm";

class Pearson extends Component {
	constructor() {
		//dynamiczna zmiana obiektów
		super();
		//stan
		this.state = {
			//perosn dane w konstruktorze
			Pearson: [
				{
				 pesel: "Przykład", name: "Przykład", lastname: "Przykład", adres: "Przykład", tel: "Przykład", email: "Przykład", plec: "Przykład" },
			],
				//nastepny stan editPearson to co uzytkownik doda.jezeli nie jest wypelnione wtedy brak
			editPearson: {
				pesel: "Brak",
				name: "Brak",
				lastname: "Brak",
				adres: "Brak",
				tel: "Brak",
				email: "Brak",
				plec: "Brak",
			},
			
		};
		
//stworzenie zmiennych do funkcji
		this.addPearson = this.addPearson.bind(this);
		this.savePearson = this.savePearson.bind(this);
	}
	//funkja add person dodaje nowego persona
	addPearson(val) {
		this.setState((prevState) => {
			
			return {
		
				editPearson: Object.assign(prevState.editPearson, val),
							};
		});

	}
	//zapisanie persona, sprawdzam czy powtarza sie pesel jezeli tak to blad.Zapisywanie stanu i porownanie stanu wczesniejszego z nowym
	savePearson() {
		this.setState((prevState) => {
			const { Pearson, editPearson } = prevState;
			const lastPearson = Pearson[Pearson.length - 1];

			if(lastPearson.pesel == editPearson.pesel){
				editPearson.pesel = "Błąd powtarzający się pesel!";
			
			}
				//porownanie czy pesel jest rowny poprzedniemu.lista
			const newLesson = {
				
				pesel:editPearson.pesel || lastPearson.pesel,
				name: editPearson.name || lastPearson.name,
				lastname: editPearson.lastname || lastPearson.lastname,
				adres: editPearson.adres || lastPearson.adres,
				tel: editPearson.tel || lastPearson.tel,
				email: editPearson.email || lastPearson.email,
				plec: editPearson.plec || lastPearson.plec,
			};

			
			return {
				//dodaje nowe osoby tablica postrzepiona.uzywana wtedy kiedy nie wiadomo ile bedzie miala elementow
				Pearson: [...Pearson, newLesson],
				editPearson: {
					...newLesson,
				},
			};
		});
	}


	

	render() {
		//zwraca wszsytko
		const Pearson = this.state.Pearson.map((elm) => {
			return (
				//odwolanie do klasy outpus przypisanie pod element mapowania
				<OutPut
					key={elm.pesel}
					name={elm.name}
					pesel={elm.pesel}
					lastname={elm.lastname}
					adres = {elm.adres}
					tel = {elm.tel}
					email={elm.email}
					plec = {elm.plec}
			
				/>
				
			);
	
		});

		return (
			<div className='EdycjaLekcji'>
				<br></br>
				<h1 id='h1'>Dane Osobowe</h1>
			
				<PearsonForm
					onInputChange={(val) => this.addPearson(val)}
					onSave={() => this.savePearson()}
				></PearsonForm>

				<table>
					<tr>
						<th>Pesel</th>
						<th>Name</th>
						<th>Lastname</th>
						<th>Adres</th>
						<th>Tel</th>
						<th>Email</th>
						<th>Płeć</th>
						</tr>
						<tbody>
						{Pearson}
						</tbody>

			

				</table>
			</div>
		);
	}
}

export default Pearson;
