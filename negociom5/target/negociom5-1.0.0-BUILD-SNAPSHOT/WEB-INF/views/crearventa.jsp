<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Crear Venta</title>
	</head>
	<body>
		<h1>Crear venta</h1>
		<form method="post" action="procesarcrear">
			ID: <input type="text" name="txtidventa" id="txtidventa" /><br/>
			Fecha: <input type="text" name="txtfecha" id="txtfecha" /><br/>
			Vendedor: <input type="text" name="txtvendedor" id="txtvendedor" /><br/>
			Monto: <input type="text" name="txtmonto" id="txtmonto" /><br/>
			<input type="submit" value="Guardar venta" /><br/>
		</form>	
		<br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />/'>Ir al listado de ventas</a>		
	</body>
</html>