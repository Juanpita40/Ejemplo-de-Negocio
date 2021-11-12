<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Venta</title>
</head>
<body>
		<h1>Editar venta</h1>
		<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesareditar'>
			ID: <input type="text" name="txtidventa" id="txtidventa" value='<c:out value="${myvnt.getId()}" />' readonly /><br/>
			Fecha: <input type="text" name="txtfecha" id="txtfecha" value='<c:out value="${myvnt.getFecha()}" />' /><br/>
			Vendedor: <input type="text" name="txtvendedor" id="txtvendedor" value='<c:out value="${myvnt.getVendedor()}" />' /><br/>
			Monto: <input type="text" name="txtmonto" id="txtmonto" value='<c:out value="${myvnt.getMonto()}" />' /><br/>
			<input type="submit" value="Editar venta" /><br/>
		</form>	
		<br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />'>Ir al listado de ventas</a>		

</body>
</html>