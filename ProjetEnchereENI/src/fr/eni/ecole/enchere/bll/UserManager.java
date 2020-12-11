package fr.eni.ecole.enchere.bll;

import fr.eni.ecole.enchere.dal.dao.DAOFactory;
import fr.eni.ecole.enchere.dal.dao.UtilisateurDAO;
import fr.eni.ecole.enchere.dal.dao.UtilisateurDAOJdbcImpl;

public class UserManager {
	
	private UtilisateurDAO utilisateurDAO;

	public UserManager() {
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}
//	
//	//Vérification 
//	
//	if (pseudo != null || email != null && mdp != null) {
//		
//		user = null;
//		
//		// vérifier avec DB (utilisateurDAO)
//		//user = UtilisateurDAO.verifPseudoMdpEmail(pseudo, mdp, email);
//		
//		// Ajout info utilisateur
//		session.setAttribute("pseudo", user.getPseudo());
//		session.setAttribute("mdp", user.getMotDePasse());
//		session.setAttribute("email", user.getEmail());
//		
//		
//		if(user != null && user.getPseudo() != null) {
//			
//		request.getSession().setAttribute("UserOK", user);
//			
//		// Rediriger vers la page d'accueil ?
//		
//		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/accueil.jsp").forward(request, response);			
//		//System.out.println("réussi");
//
//		session.setAttribute("sessionUtilisateur", user);
//		}
//		
//	} else {
//		//this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/accueil.jsp").forward(request, response);
//		//System.out.println("raté");
//		// Mdp ou indetifiant incorrect
//			doGet(request, response);
//	}
}
