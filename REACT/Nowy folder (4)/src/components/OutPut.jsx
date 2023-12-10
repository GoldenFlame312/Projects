import Proptypes from "prop-types";

function BoxOutPut(props) {
	
	return (
		
		<tr>
				<td>{props.pesel}</td>
				<td>{props.name}</td>
				<td>{props.lastname}</td>
				<td>{props.adres}</td>
				<td>{props.tel}</td>
				<td>{props.email}</td>
				<td>{props.plec}</td>
		</tr>
	
	);
}

BoxOutPut.propTypes = {
	pesel: Proptypes.string,
	name: Proptypes.string,
	lastname: Proptypes.string,
	adres: Proptypes.string,
	tel: Proptypes.string,
	email: Proptypes.string,
	plec: Proptypes.string,
};

export default BoxOutPut;
