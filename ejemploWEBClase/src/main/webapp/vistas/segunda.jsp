<%@ include file="/vistas/cabecera.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Lista Alumno</title>
<style type="text/css">
body {
	background: #f0ffff;
}

table {
	background: #DEB887;
	padding: 15px;
	border: solid 2px #000000;
	width: 100%;
	max-width: 600px;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

h1 {
	text-align: center;
}

.inicio {
	display: block;
	margin: 0 auto;
}
</style>

</head>


<body>
	<h1>Registro nuevo usuario</h1>
	<form action="form" method="post">
		<input type="hidden" name="instruccion" value="repostajeGasolinera">
		<table width="35%" border="0">

			<tr>
				<th width="13%"><label for="id">ID </label></th>
				<td width="87%"><input type="number" name="id" id="id"></td>
			</tr>

			<tr>
				<th width="13%"><label for="nombre">Nombre</label></th>
				<td width="87%"><input type="text" name="nombre" id="nombre"></td>
			</tr>

			<tr>
				<th width="13%"><label for="apellidos">Apellidos:</label></th>
				<td width="87%"><input type="text" name="apellidos"
					id="apellidos"></td>
			</tr>

			<tr> 
				<th width="13%"><label for="edad">Edad:</label></th>
				<td width="87%"><input type="number" name="edad" id="edad"></td>
			</tr>

			<tr>
				<th width="13%"><label for="tlf">Telefono:</label></th>
				<td width="87%"><input type="text" name="tlf" id="tlf"></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit"
					name="button" id="button" value="Registrar"></td>
			</tr>
		</table>
	</form>
</body>

</html>