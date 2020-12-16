package fr.eni.ecole.enchere.bll;

import fr.eni.ecole.enchere.bo.Utilisateur;
import fr.eni.ecole.enchere.dal.DAOFactory;
import fr.eni.ecole.enchere.dal.dao.UtilisateurDAO;

public class UserManager {

	private UtilisateurDAO utilisateurDAO;

	public UserManager() {
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	// Vérification

	public Utilisateur connectionUser(String identifiant, String mdp) throws Exception {

		if (identifiant != null && mdp != null) {

			Utilisateur u = utilisateurDAO.verifPseudoMdpEmail(identifiant, mdp);
			if (u == null) {
				throw new Exception("login mot de passe incorrect");

			} else {
				return u;
			}
		}
		else {
			throw new Exception("Identifiant ou mot de passe nulle");
		}

	}

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
//			
//		// Rediriger vers la page d'accueil ?
//		
//		//System.out.println("réussi");
//
//		session.setAttribute("sessionUtilisateur", user);
//		}
//		
//	} else {
//		//this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/accueil.jsp").forward(request, response);
//		//System.out.println("raté");
//		// Mdp ou indetifiant incorrect
//	}
}
