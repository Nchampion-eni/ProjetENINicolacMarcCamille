<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Connexion</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/style.css" />
	<%@include file="header.jsp"%>
</head>
<body>

	
	<c:if test="${ empty listeErreur}">
		<c:forEach items="${listeErreur}" var="msg" >
			<p>${msg}</p>
		</c:forEach>
	</c:if>
	
	<main id="MAIN">

        <form method="post">
           <fieldset>
           <legend>Connexion</legend>
            <div class="mb-3">
                <label for="pseudo" class="form-label">Pseudo :</label>
                <input type="text" class="form-control" name="pseudo">
           
            </div>
            <div class="mb-3">
                <label for="mdp" class="form-label">Mot de passe :</label>
                <input type="password" class="form-control" id="exampleInputPassword1" name="mdp">
            </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Se souvenir de moi</label>
            </div>
            <button type="submit" class="btn btn-primary" name="connexion">Connexion</button>
            <button type="submit" class="btn btn-primary" name="inscription">Créer un compte</button><br>
            <a href="">Mot de passe oublié</a>
        </fieldset>
        </form>
        


    </main>
	<%@include file="footer.jsp"%>
</body>
</html>