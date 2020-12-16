<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profil</title>
</head>
<body>

	<h1>Votre profil :</h1>
	
	<p> Pseudo : <c:out value ="${sessionScope.user.pseudo}" /></p>
	<p> Prénom : <c:out value ="${sessionScope.user.prenom}" /></p>
	<p> Email : <c:out value ="${sessionScope.user.email}" /></p>
	<p> Téléphone : <c:out value ="${sessionScope.user.telephone}" /></p>
	<p> Rue : <c:out value ="${sessionScope.user.rue}" /></p>
	<p> Code postal : <c:out value ="${sessionScope.user.codePostal}" /></p>
	<p> Ville : <c:out value ="${sessionScope.user.ville}" /></p>
	
	<button type="submit" name="modifier">Modifier</button>	

</body>
</html>