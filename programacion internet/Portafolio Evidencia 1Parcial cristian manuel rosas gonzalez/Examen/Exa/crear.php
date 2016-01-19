<?php
 
$con = mysql_connect('localhost','root','root') or die('Error en conexion a la DB');
mysql_select_db('usuario', $con) or die('Error al seleccionar la DB');
 

 
$res = mysql_query("SELECT * FROM usuario");

$arr = array();
while($obj =mysql_fetch_object($res)){
	$arr[] = array('id' => $obj->id, 'nombre' => $obj->nombre, 'edad'=>$obj->edad,'genero'=>$obj->genero);
}
echo   json_encode($arr) ;



 
 
?>