package fr.eni.ecole.enchere.bll;

import javax.servlet.http.HttpSession;

import fr.eni.ecole.enchere.BusinessException;
import fr.eni.ecole.enchere.bo.Utilisateur;
import fr.eni.ecole.enchere.dal.DAOFactory;
import fr.eni.ecole.enchere.dal.UtilisateurDAO;
import fr.eni.ecole.enchere.dal.dao.UtilisateurDAOJdbcImpl;

public class UserManager {
	
	private UtilisateurDAO utilisateurDAO;

	public UserManager() {
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	public Utilisateur connectionUser(String pseudo, String mdp) throws Exception{
		
		
		boolean verifPseudo = verifPseudo(pseudo);
		boolean verifMdp = verifMdp(mdp);
		Utilisateur user = new Utilisateur();
		
		
		if(verifMdp&&verifPseudo == true) {
			System.out.println("ça passe");
			return user = utilisateurDAO.verifPseudoMdpEmail(pseudo, mdp);		
		}else {
			BusinessException be = new BusinessException();
			System.out.println("nop");
			be.ajouterErreur("Login ou mot de passe incorrecte");	
			throw be;
			
			
		}	
		
		
	}
	
//	private boolean verifPseudo(String pseudo) {
//		Utilisateur user = new Utilisateur();
//		
//		if(user.getPseudo().equals(pseudo) && pseudo != null) {			
//			return true;
//		}else {			
//			BusinessException be = new BusinessException();
//			be.ajouterErreur("Login incorrecte");
//		return false;
//		}
//	}
	
//	private boolean verifMdp(String mdp) {
//		Utilisateur user = new Utilisateur();
//		
//		if(user.getMotDePasse().equals(mdp) && mdp != null) {			
//			return true;
//		}else {	
//			BusinessException be = new BusinessException();
//			be.ajouterErreur("Mot de passe incorrecte");
//		return false;	
//		}
//		
//	
//	}
	
	private boolean verifPseudo(String pseudo) {
		Utilisateur user = new Utilisateur();
		
		if(pseudo != null) {			
			return true;
		}else {			
			BusinessException be = new BusinessException();
			be.ajouterErreur("Login incorrecte");
		return false;
		}
	}
	
	private boolean verifMdp(String mdp) {
		Utilisateur user = new Utilisateur();
		
		if( mdp != null) {			
			return true;
		}else {	
			BusinessException be = new BusinessException();
			be.ajouterErreur("Mot de passe incorrecte");
		return false;	
		}
		
	
	}
	
	
	
	
	
		
	
	
		
		
		
}
