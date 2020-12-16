package fr.eni.ecole.enchere.ihm;

import java.io.IOException;

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
		//Lien vers jsp 
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connection.jsp").forward(request, response);

	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	// Récupérer le pseudo et le mot de passe

	String pseudo = request.getParameter("pseudo");// == pseudo + email 
	String mdp = request.getParameter("mdp");

	UserManager um = new UserManager();
	
	
		try {
			Utilisateur user = um.connectionUser(pseudo, mdp);
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			request.getRequestDispatcher("/WEB-INF/jsp/accueil.jsp").forward(request, response);
			System.out.println("c'est ok");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/jsp/connection.jsp").forward(request, response);
			System.out.println("c'est non " + pseudo + mdp);
	
		}
		
	}
	
}


