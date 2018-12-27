<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Trabajar la timidez - test inicial</title>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Test inicial</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<form:form action="shyScoring" modelAttribute="initialTestWrapper" method="POST">
			
				<!-- loop over and print each question -->
				<c:forEach items="${initialTestWrapper.questionsList}" var="tempQuestion" varStatus="rowItem">
					<label>${rowItem.index + 1}. ${tempQuestion.question}</label>
					<form:input path="questionsList[${rowItem.index}].punctuation" />
					<br/>
				</c:forEach>
				<input type="submit" value="Enviar">
			</form:form>
		</div>
	</div>
	<a href="../">Volver al menú principal</a><br/>
</body>
</html>