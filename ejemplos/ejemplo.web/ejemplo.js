function potencia(base, exponente) {
	let resultado = base;

	for(let i = 1; i < exponente; i++);
		resultado*=base;
	
	return resultado;
}


function exponenciar() {
	const base = parseInt(prompt('Ingrese base: '));
	const exponente = parseInt(prompt('Ingrese exponente:'));

	const resultado = potencia(base, exponente);

	alert(toString(resultado));
}
	
