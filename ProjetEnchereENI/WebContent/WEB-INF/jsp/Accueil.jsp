<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<style>
    @import url('https://fonts.googleapis.com/css2?family=Alegreya&family=Anton&display=swap');

</style>
<link rel="stylesheet" href="./Accueil.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Alegreya&family=Anton&family=Pacifico&display=swap" rel="stylesheet">

<title>Page d'accueil</title>

</head>
<header>
    <div class="Accueil1">ENI-Enchère</div>
    <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand">
                <h1>


                </h1>
            </a>

            <a class="heady" href="a">Enchère</a><br>
            <a href="Vendre%20un%20article.html">Vendre un article</a><br>
            
            <a href="contact.html">Mon profil</a> <br>
            <a href="D%C3%A9connexion.html"> Déconnexion </a> <br>
            <form class="d-flex">
                <input class="form-control me-2" type="Recherche" placeholder="Recherche" aria-label="Recherche">
                <button class="" type="submit">Validez</button>
            </form>
        </div>
        
    </nav>
</header>

<body>
 <div class="test">Filtres :
    <di><input class="test" class="form-control me-2" type="Recherche" placeholder="Recherche" aria-label="Recherche">
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


    <div class="wrapper"> Achat 
    <input type="checkbox" name="Achat :" /> 
    <ul class="list-group">
        <li class="list">
            <input class="form-check-input me-1" type="checkbox" value="" aria-label="...">
            Enchères ouvertes
        </li>
        <li class="list">
            <input class="form-check-input me-1" type="checkbox" value="" aria-label="...">
            Mes enchères en cours
        </li>
        <li class="list">
            <input class="form-check-input me-1" type="checkbox" value="" aria-label="...">
            Mes enchères reportées
        </li>

    </ul>

    <br>

    <div class="wrapper">
    <p class="test">Mes ventes  <input type="checkbox" name="Achat :" /> </p>
    <ul class="list-group">
        <li class=list>
            <input class="form-check-input me-1" type="checkbox" value="" aria-label="...">
            En cours
        </li>
        <li class="list">
            <input class="form-check-input me-1" type="checkbox" value="" aria-label="...">
            Non débutées
        </li>
        <li class="list">
            <input class="form-check-input me-1" type="checkbox" value="" aria-label="...">
            Terminées
        </li>

    </ul>
    </div>

    <div class="wapper" style="width: 18rem;">
        <img src="Image/Image/adidas.jpg" class="card-img-top" alt="Homme">
        <div class="card-body">
            <h5 class="card-title">Chaussure Adidas</h5>
            <p class="card-text">Taille 42</p>
        </div>
        <ul class="wapper">
            <li class="texte">Homme
        </li>
            <li class="texte">40 points</li>
            <li class="texte">Très bon état</li>
        </ul>
        <div class="wapper">
            <a href="#" class="red">Enchèrire</a>
            <a href="#" class="red">Voir l'annonce</a>
        </div>
    </div>

    
    </div>



</body>
</html>