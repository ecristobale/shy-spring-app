<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Trabajar la timidez - resultado test inicial</title>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Resultado Test inicial</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			Tienes una puntuación de: ${totalPunctuation} 
			<br/>
			Resultado: ${initialTestResult}
			
		</div>
	</div>
	<a href="../">Volver al menú principal</a><br/>
</body>
</html>