<!-- soporte para etiquetas JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
<title>Lista de clientes</title>
<!-- referencia a archivo CSS de estilos (WebContent/resources/css/styles.css) -->
<!-- la ruta de los archivos estáticos está establecida en el archivo spring-mvcservlet.xml -->
<link
type="text/css" rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/style.css"
/>
</head>
<body>
<h2>Clientes</h2>
<table>
<thead>
<tr>
<th>Nombre</th>
<th>Apellidos</th>
<th>Email</th>
</tr>
</thead>
<tbody>
<c:forEach var="cliente" items="${clientes}">
<tr>
<td> ${cliente.nombre} </td>
<td> ${cliente.apellidos} </td>
<td> ${cliente.email} </td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>