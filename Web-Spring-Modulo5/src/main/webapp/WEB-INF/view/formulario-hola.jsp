<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- el formulario enviar� los datos a la url /procesarFormulario a trav�s del m�todo
GET de HTTP -->
<form action="procesarFormulario" method="GET">
<!-- caja de texto donde se escribir� el nombre -->
<input type="text" name="nombre" placeholder="Escribe tu nombre" />
<input type="text" name="edad" placeholder="Escribe tu edad" />
<!-- bot�n para enviar la informaci�n -->
<input type="submit" />
</form>
</body>
</html>