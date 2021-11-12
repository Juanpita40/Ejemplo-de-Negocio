<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Negocio - Listado ventas</title>
	</head>
	<body>
		<h1>Listado de ventas</h1>
		<table>
			<tr>
				<th>ID Venta</th>
				<th>Fecha</th>
				<th>Vendedor</th>
				<th>Monto</th>
				<th>Acciones</th>
			</tr>
			<c:forEach items="${lventas}" var="vnt">
				<tr>
					<td><c:out value="${vnt.getId()}" /></td>
					<td><c:out value="${vnt.getFecha()}" /></td>
					<td><c:out value="${vnt.getVendedor()}" /></td>
					<td><c:out value="${vnt.getMonto()}" /></td>
					<td>
						<a href='<c:out value="${pageContext.request.contextPath}" />/eliminarventa/<c:out value="${vnt.getId()}" />'>Eliminar</a>
						&nbsp; | &nbsp;
						<a href='<c:out value="${pageContext.request.contextPath}" />/editarventa/<c:out value="${vnt.getId()}" />'>Editar</a>
						&nbsp; | &nbsp;
						<a href='<c:out value="${pageContext.request.contextPath}" />/detalleventa/<c:out value="${vnt.getId()}" />'>Ver detalle</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />/crear'>Crear venta</a>
		<br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />/logout'>Cerrar sesión</a>
	</body>
</html>