package fr.eni.ecole.enchere.dal.dao;

public abstract class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO() {
		
		return new UtilisateurDAOJdbcImpl();
	}

}