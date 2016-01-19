

function validacion () {
	
	var nombre = document.getElementById("nom").value;
	var apellido = document.getElementById("ape").value;
	var tel = document.getElementById("tel").value;

	if(nombre == ""){
		alert("Campo vacio nombre");
		return false;
	}
	if(apellido == ""){
		alert("Campo vacio apellido");
		return false;
	}
	if(tel == ""){
		alert("Campo vacio Telefono");
		return false;
	}

}