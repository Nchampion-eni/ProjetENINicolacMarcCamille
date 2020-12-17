<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8;"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Page de vente</title>
<!--  <link href="../../CSS/vente.css" rel="stylesheet"> -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/vente.css" />
</head>
<h1>Veuillez rentrée le details de l'article à mettre en vente</h1>
<body>
	<form action="ServletGerantLesVentes" method="post">
		<label for="nom">nom :</label> <input type="text" name="nom">
		<br> <label for="categorie">categorie :</label> <select
			name="categorie">
			<option value="1">Informatique</option>
			<option value="2">Ameublement</option>
			<option value="3">Vêtement</option>
			<option value="4">Sport & Loisirs</option>
		</select> <br> <label for="prix">prix :</label> <input type="number"
			name="prix"> <br> <label for="stock">stock :</label> <input
			type="number" name="stock"> <br>
		<!-- <label for="dateDebut">Date du jour : <span class="requis"></span></label>
		<input type="Date" name="dateDebut" value="" /> -->
		<label for="dateFin">date de fin de l'enchère : <span
			class="requis"></span>
		</label> <input type="Date" name="dateFin" value="" /> <br> <label
			for="description">Description :</label> <input type="text"
			name="description"> <br> <input name="submit"
			type="submit" value="OK">
	</form>
<%@include file="footer.jsp"%>
</body>
</html>


















