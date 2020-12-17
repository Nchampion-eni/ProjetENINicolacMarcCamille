<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vente</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/vente.css" />
<%@include file="header.jsp"%>
</head>
<body>
<h1>Votre Article :</h1>
	
<p>Le nom de votre article :	${article.nom} </p>
	<p> Description :	${article.description} </p>
	<p> mise en vente le :	${article.dateDebut} </p>
<p> fin de l'enchère le :	${article.dateFin} </p>
	<p> prix initial :	${article.prix} </p>
	
	
	
	
	<button type="submit" name="modifier">Modifier</button>	
	<%@include file="footer.jsp"%>
</body>
</html>