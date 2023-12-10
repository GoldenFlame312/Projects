import React from "react";
import "../PearsonForm.css";
const PearsonForm = (props) => {
	return (
		<div className='EdycjaLekcji'>
			<div className='EdycjaLekcji_input-grupa'>
				<br />
				<label htmlFor='pesel'>Podaj pesel: </label>
				<input
					placeholder='Wpisz pesel'
					type='number'
					id='pesel'
					name='pesel'
					onChange={(e) =>
						props.onInputChange({ [e.target.name]: e.target.value })
					}
				/>
			</div>
			<div className='EdycjaLekcji_input-grupa'>
				<label htmlFor='name'>Podaj imie: </label>
				<input
					placeholder='Wpisz imie'
					type='name'
					id='name'
					name='name'
					onChange={(e) =>
						props.onInputChange({ [e.target.name]: e.target.value })
					}
				/>
			</div>
			<div className='EdycjaLekcji_input-grupa'>
				<label htmlFor='lastname'>Podaj nazwisko: </label>
				<input
					placeholder='Wpisz nazwisko'
					type='text'
					id='lastname'
					name='lastname'
					onChange={(e) =>
						props.onInputChange({ [e.target.name]: e.target.value })
					}
				/>
			</div>

			<div className='EdycjaLekcji_input-grupa'>
				<label htmlFor='lastname'>Podaj pełny adres: </label>
				<input
					placeholder='Wpisz adres'
					type='text'
					id='adres'
					name='adres'
					onChange={(e) =>
						props.onInputChange({ [e.target.name]: e.target.value })
					}
				/>
			</div>

			<div className='EdycjaLekcji_input-grupa'>
				<label htmlFor='lastname'>Podaj tel.: </label>
				<input
					placeholder='Wpisz tel'
					type='tel'
					id='tel'
					name='tel'
					onChange={(e) =>
						props.onInputChange({ [e.target.name]: e.target.value })
					}
				/>
			</div>

			<div className='EdycjaLekcji_input-grupa'>
				<label htmlFor='lastname'>Podaj email.: </label>
				<input
					placeholder='Wpisz email'
					type='email'
					id='email'
					name='email'
					onChange={(e) =>
						props.onInputChange({ [e.target.name]: e.target.value })
					}
				/>
			</div>

			<div className='EdycjaLekcji_input-grupa'>
				<label htmlFor='lastname'>Podaj płeć.: </label>
				<input
					placeholder='Wpisz płeć'
					type='text'
					id='plec'
					name='plec'
					onChange={(e) =>
						props.onInputChange({ [e.target.name]: e.target.value })
					}
				/>
			</div>
			
			<button onClick={() => props.onSave()}>OK</button>
			<button id='btncanel' type='reset'>
				Cancel
			</button>
		</div>
	);
};

export default PearsonForm;
