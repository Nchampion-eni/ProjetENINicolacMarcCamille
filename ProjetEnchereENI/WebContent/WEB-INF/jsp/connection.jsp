<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
<title>Connexion</title>
</head>
<body>

	<%@include file="header.jsp"%>
	
	
	<form method="post">
		<fieldset>
			<legend>Connexion</legend>

			<label for="pseudo">Pseudo :</label> 
			<input type="text" name="pseudo">
				
				<label for="mdp">Mot de passe :</label> 
				<input type="password" name="mdp"> 
				
			<input type="checkbox">
			<label>Se souvenir de moi</label> 
			
			<button type="submit" name="connexion">
				Connexion
			</button>
			
			
			<a href="">Mot de passe oublié</a>
			
			<button type="submit" name="inscription">
				Créer un compte
			</button>
			
		</fieldset>
		
	</form>
	<%@include file="footer.jsp"%>
</body>
</html>