package fr.eni.ecole.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ecole.enchere.bo.Utilisateur;

@WebServlet("/ServletInscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletInscription() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// faire lien JSP + afficher
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		String Nom = request.getParameter("Nom");
		String Prenom = request.getParameter("Prenom");
		String Pseudo = request.getParameter("Prénom");
		String Téléphone    = request.getParameter("Téléphone");
		String Adresse    = request.getParameter("Adresse");
		String Ville    = request.getParameter("Ville");
		String CodePostal   = request.getParameter("Code_Postal");
		String Motdepasse = request.getParameter("Mot_de_passe");
		String Confirmation = request.getParameter("Confirmation");
		String Conditions = request.getParameter("Conditions");
		String Valider = request.getParameter("Valider");
		
//		Utilisateur user = new Utilisateur (Nom,Prenom,Pseudo,Téléphone,Adresse,Ville,CodePostal,Motdepasse,Confirmation,Conditions,Valider);
//		
//		ServletInscription session = request.getSession();
//		
//		session.setAttribute("Nom", Nom);
//		session.setAttribute("Pseudo", Prenom);
//		
//		if(Nom !=null || Prenom != null || Pseudo!=null || Téléphone!=null || Adresse!=null || Ville!=null) {
//			
//			user = null;
//}else {
//			
//		}
//	}
//
//	private void setAttribute(String string, String nom) {
//		
	}
}
