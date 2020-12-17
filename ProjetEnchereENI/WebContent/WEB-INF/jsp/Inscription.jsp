<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="fr">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<title>Inscription</title>
<%@include file="header.jsp"%>
</head>

<body>
	<h1>Vous êtes sur la page d'inscription</h1>
	<form class="needs-validation" novalidate>
		<div class="form-row">
			<div class="col-md-4 mb-3">
				<label for="validationCustom01">Nom</label> <input type="text"
					class="form-control" id="validationCustom01"
					placeholder="First name" value="Veuillez écrire votre nom" required>
				<div class="valid-feedback">Looks good!</div>
			</div>
			<div class="col-md-4 mb-3">
				<label for="validationCustom02">Prénom</label> <input type="text"
					class="form-control" id="validationCustom02"
					placeholder="Last name" value="Veuillez écrire votre Prénom"
					required>
				<div class="valid-feedback">Looks good!</div>
			</div>
			<div class="col-md-4 mb-3">
				<label for="validationCustomUsername">E-mail</label>
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text" id="inputGroupPrepend">@</span>
					</div>
					<input type="text" class="form-control"
						id="validationCustomUsername" placeholder="Indiquer votre email"
						aria-describedby="inputGroupPrepend" required>
					<div class="invalid-feedback"></div>
				</div>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-6 mb-3">
				<label for="validationCustom03">Téléphone</label> <input type="text"
					class="form-control" id="validationCustom03"
					placeholder="Veuillez indiquer votre numero de téléphone" required>
				<div class="invalid-feedback">Veuillez indiquer votre numero
					de téléphone.</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationCustom04">Adresse</label> <input type="text"
					class="form-control" id="validationCustom04"
					placeholder="Veuillez indiquer votre adresse." required>
				<div class="invalid-feedback">Veuillez indiquer votre adresse.
				</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationCustom05">Ville</label> <input type="text"
					class="form-control" id="validationCustom05"
					placeholder="Veuillez indiquer la ville." required>
				<div class="invalid-feedback"></div>
			</div>
		</div>
		<div class="col-md-3 mb-3">
			<label for="validationCustom05">Code Postal</label> <input
				type="text" class="form-control" id="validationCustom05"
				placeholder="Veuillez indiquer le code postal." required>
			<div class="invalid-feedback">Veuillez indiquer le code postal.
			</div>
		</div>
		<div class="col-md-3 mb-3">
			<label for="validationCustom05">Mot de passe</label> <input
				type="text" class="form-control" id="validationCustom05"
				placeholder="Veuillez indiquer le mot de passe." required>
			<div class="invalid-feedback">Veuillez indiquer le mot de
				passe.</div>
		</div>
		<div class="col-md-3 mb-3">
			<label for="validationCustom05">Confirmation</label> <input
				type="text" class="form-control" id="validationCustom05"
				placeholder="Veuillez corfimer le mot de passe." required>
			<div class="invalid-feedback">Veuillez corfimer le mot de
				passe.</div>
		</div>
		<div class="form-group">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="invalidCheck" required> <label class="form-check-label"
					for="invalidCheck"> Accepter les conditions </label>
				<div class="invalid-feedback">You must agree before
					submitting.</div>
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Valider</button>
	</form>

	<script>
        // Example starter JavaScript for disabling form submissions if there are invalid fields
        (function() {
            'use strict';
            window.addEventListener('load', function() {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation');
                // Loop over them and prevent submission
                var validation = Array.prototype.filter.call(forms, function(form) {
                    form.addEventListener('submit', function(event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            }, false);
        })();
    </script>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    -->
</body>
</html>