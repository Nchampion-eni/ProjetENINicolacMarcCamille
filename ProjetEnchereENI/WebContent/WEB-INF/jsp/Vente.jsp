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
<form action="ServletGerantLesVentes" method="post">
	<label for="nom">nom :</label>
	<input type="text" name="nom">

	<label for="categorie">categorie :</label>
	<select>
		<option value="1">Informatique</option>
		<option value="2">Ameublement</option>
		<option value="3">Vêtement</option>
		<option value="4">Sport & Loisirs</option>
	</select>

	<label for="prix">prix :</label>
	<input type="number" name="prix">

	<label for="stock">stock :</label>
	<input type="number" name="stock">

	<label for="dateDebut">Date du jour : <span class="requis"></span></label>
	<input type="date" name="disponibilite" value="" />

	<label for="dateFin">date de fin de l'enchère : <span
		class="requis"></span></label>
	<input type="date" name="disponibilite" value="" />


	<label for="description">Description :</label>
	<input type="text" name="description">


	<input name="submit" type="submit" value="OK">
	</form>
</body>
</html>


















