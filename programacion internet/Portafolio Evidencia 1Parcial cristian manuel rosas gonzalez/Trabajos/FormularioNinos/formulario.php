<?php
	
	
		$mensaje=null

		$name= $_POST["name"];
		$ape= $_POST["ape"];
		$tel= $_POST["tel"];
		$correo= $_POST["correo"];
		$dire= $_POST["mensaje"];


		if($name == ""){
			$mensaje = "Ingrese el nombre";
			echo "mal";
			}
			else if(!preg_match("/^[a-z]+$/i", $name)){
				$mensaje = "Ingrese solo letras";
			}
			if($ape == ""){
				$mensaje = "Ingrese el ape";
				echo "mal";
			}
			else if(!preg_match("/^[a-z]+$/i", $ape)){
				$mensaje = "Ingrese solo letras";
			}
			if($tel == ""){
				$mensaje = "Ingrese el tel";
				echo "mal";
			}
			else if(!preg_match("/[0-9]{9}$/", $tel)){
				$mensaje = "Ingrese solo numeros";
			}
			if($correo == ""){
				$mensaje = "Ingrese el correo";
				echo "mal";
			}
			else if(!preg_match("/^[a-zA-Z0-9\._-]+@[a-zA-Z0-9-]{2,}[.][a-zA-Z]{2,4}$/", $correo)){
				$mensaje = "Ingrese solo numeros y letras ";
			}
			if($dire == ""){
				$mensaje = "Ingrese la direccion";
				echo "mal";
			}
			else if(!preg_match("[^a-zA-Z0-9]", $dire)){
				$mensaje = "Ingrese solo numeros y letras ";
			}
		else{
			//consulta a la base de datos
			$mensaje="Datos correctamente Guardados";
		}


	
?>