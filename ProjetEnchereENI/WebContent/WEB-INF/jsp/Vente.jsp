<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Page de vente</title>
</head>
<h1>Veuillez rentrée le details de l'article à mettre en vente</h1>
<body>
	<label for="nom">nom :</label>
	<input type="text" name="nom">

	<label for="categorie">categorie :</label>
	<input type="text" name="categorie">

	<label for="prix">prix :</label>
	<input type="number" name="prix">

	<label for="stock">stock :</label>
	<input type="number" name="stock">

	<label for="dateFin">date de fin d'enchere :</label>
	<input type="datetime-local" name="dateFin">
<input name="submit" type="submit" value="OK " >
</body>
</html>