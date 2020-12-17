<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="fr">





<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">



<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/CSS/Accueil.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Alegreya&family=Anton&display=swap')
	;
</style>

<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Alegreya&family=Anton&family=Pacifico&display=swap"
	rel="stylesheet">

</head>
<header>
	<div class="Accueil1">ENI-Enchère</div>
	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand">
				<h1></h1>
<p>Vos crédit : <c:out value ="${sessionScope.user.credit}" /></p>
			href="./ServletConnection">Connection</a><br> <a
				href="./ServletGerantLesVentes">Vendre un article</a><br> <a
				href="./ServletAfficherProfil">Mon profil</a> <br> <a
				href="./ServletDeconnexion"> Déconnexion </a> <br>
			<form class="d-flex">
				<input class="form-control me-2" type="Recherche"
					placeholder="Recherche" aria-label="Recherche">
				<button class="" type="submit">Validez</button>
			</form>
		</div>

	</nav>
</header>

<body>

	<div class="test">
		Filtres :
		<di> <input class="test" class="form-control me-2"
			type="Recherche" placeholder="Recherche" aria-label="Recherche">
		<button class="btn btn-outline-success" type="submit">Validez</button>
		</di>
	</div>

	<div class="wrapper">
		<div class="input-group-prepend">
			<label class="wrapper" for="inputGroupSelect01">Catégorie </label>
		</div>
		<select class="custom-select" id="inputGroupSelect01">
			<option selected>Choix</option>
			<option value="1">Chaussures</option>
			<option value="2">Sacs</option>
			<option value="3">Meuble</option>
		</select>
	</div>


	<div class="wrapper">
		<p class="">
			Achats <input type="checkbox" name="Achat :" />
		<ul class="list-group">
			<li class=list><input class="form-check-input me-1"
				type="checkbox" value="" aria-label="..."> Enchères ouvertes
			</li>
			<li class="list"><input class="form-check-input me-1"
				type="checkbox" value="" aria-label="..."> Mes enchères en
				cours</li>
			<li class="list"><input class="form-check-input me-1"
				type="checkbox" value="" aria-label="..."> Mes enchères
				remportées</li>

		</ul>
	</div>
	<br>

	<div class="wrapper">
		<p class="">
			Mes ventes <input type="checkbox" name="Achat :" />
		<ul class="list-group">
			<li class=list><input class="form-check-input me-1"
				type="checkbox" value="" aria-label="..."> En cours</li>
			<li class="list"><input class="form-check-input me-1"
				type="checkbox" value="" aria-label="..."> Non débutées</li>
			<li class="list"><input class="form-check-input me-1"
				type="checkbox" value="" aria-label="..."> Terminées</li>

		</ul>
	</div>

	<div class="card" style="width: 18rem;">
		<img src="img/793843_500_A.jpg" class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">Chaussure</h5>
			<p class="card-text">Description : Adidas homme</p>
		</div>
		<ul class="list-group list-group-flush">
			<li class="list-group-item">Bon état</li>
			<li class="list-group-item">Taille 42</li>
		</ul>
		<div class="card-body">
			<a href="#" class="card-link">Voir l'article</a> <a href="#"
				class="card-link">Enchèrir</a>
		</div>
	</div>





</body>



<%@include file="footer.jsp"%>
</html>