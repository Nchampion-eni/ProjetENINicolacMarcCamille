package fr.eni.ecole.enchere.dal;

import fr.eni.ecole.enchere.dal.dao.ArticleDAOjdbcImpl;
import fr.eni.ecole.enchere.dal.dao.UtilisateurDAO;
import fr.eni.ecole.enchere.dal.dao.UtilisateurDAOJdbcImpl;

public abstract class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO() {
		
		return new UtilisateurDAOJdbcImpl();
	}

	public static ArticleDAOjdbcImpl getArticleDAO() {
		return new ArticleDAOjdbcImpl();
	}
}