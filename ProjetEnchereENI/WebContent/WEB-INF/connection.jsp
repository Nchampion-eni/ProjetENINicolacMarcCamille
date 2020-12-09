<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <%@ include file="/WEB-INF/html/header.html"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Connexion</title>
</head>
<body>
	<form action="connexion">
		<fieldset>
			<legend>Connexion</legend>
			
			<label for="pseudo">Pseudo :</label>
			<input type="text" name="pseudo">
			
			<label for="mdp">Mot de passe :</label>
			<input type="password" name="mdp">	
			
			<input type="checkbox">
			<label>Se souvenir de moi</label>	
			
			<input type ="submit">
			
			<a href="">Mot de passe oublié</a>
			
		
		</fieldset>
	</form>
	

</body>
</html>