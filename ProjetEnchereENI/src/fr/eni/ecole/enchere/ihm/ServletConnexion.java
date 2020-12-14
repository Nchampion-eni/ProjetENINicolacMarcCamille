package fr.eni.ecole.enchere.ihm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ecole.enchere.bll.UserManager;
import fr.eni.ecole.enchere.bo.Utilisateur;

@WebServlet("/ServletConnection")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connection.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Récupérer le pseudo et le mot de passe

		String identifiant = request.getParameter("identifiant");
		String mdp = request.getParameter("mdp");

		UserManager um = new UserManager();
		try {
			Utilisateur u = um.connectionUser(identifiant, mdp);
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
			request.getRequestDispatcher("/WEB-INF/jsp/Accueil.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/jsp/connection.jsp").forward(request, response);

		}

		// Création de session


		/**
		 * recherche dans la BDD --> requete select 1/si pseudo ==BDD --> tout va bien
		 * 2/si pseudo n'est pas dans la BDD --> afficher message d'erreur BBD Table
		 * utilisateur avec toute donnée utilisateur = connection utilisateur =
		 * utilisateur dnas la BDD
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		// vérifier avec DB (utilisateurDAO)
		// Ajout info utilisateur sur le profil ??
		// session.setAttribute("pseudo", user.getPseudo()); <-- à tester

		// Rediriger vers la page d'accueil ?

		// Mdp ou indetifiant incorrect

	}

}
