<?php
 
$con = mysql_connect('localhost','root','root') or die('Error en conexion a la DB');
mysql_select_db('usuario', $con) or die('Error al seleccionar la DB');
 
$nombre = $_POST['nombre'];
$edad = $_POST['edad'];
$genero = $_POST['genero'];
 
$res = mysql_query("INSERT INTO usuario(nombre,edad,genero) VALUES('$nombre', '$edad', '$genero')");



 
 
?>