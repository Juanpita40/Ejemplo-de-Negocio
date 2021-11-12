<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminación de venta</title>
</head>
<body>
	<h1>Eliminación de venta</h1>
	<p>La venta ha sido eliminada exitosamente!</p><br/>
	<a href='<c:out value="${pageContext.request.contextPath}" />/'>Ir al listado de ventas</a>
</body>
</html>