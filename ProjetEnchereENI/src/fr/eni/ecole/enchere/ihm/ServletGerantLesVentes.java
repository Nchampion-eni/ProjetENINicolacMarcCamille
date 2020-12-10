package fr.eni.ecole.enchere.ihm;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGerantLesVentes
 */
@WebServlet("/fr/eni/ecole/enchere/ihm/ServletGerantLesVentes")
public class ServletGerantLesVentes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletGerantLesVentes() {
		super();
	}

	/**
	 * 1/Creer une enchere connection utilisateur creer un article ajouter article a
	 * la BDD afficher article dans onglet Vente creer option supprimer vente
	 * 
	 * 2/encherir connection utilisateur autre que vendeur si solde compte
	 * utilisateur > prix enchere actuel = autorisé encherir a un prix > prix actuel
	 * si solde inférieur = refus enchere
	 * 
	 * 
	 * 
	 * 3/fin de l'enchere si Date==DateFinEnchere --> fin de l'enchere le dernier
	 * utilisateur a avoir misé remporte l'enchere envoie de l'article à l'adresse
	 * de retrait
	 * 
	 * 4/ fermeture de l'enchere Utilisateur qui fait l'acquisition valide avoir
	 * reçu l'article argent versé au vendeur direictement du compte de l'acquerreur
	 * fermeture de l'enchere
	 * 
	 * 
	 * 
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Vente.jsp").forward(request, response);

	}

	
	//protected void doPost(HttpServletRequest request, HttpServletResponse response)
		//	throws ServletException, IOException {
		/**
		 * 1/Creer une enchere connection utilisateur
		 */
	

		/**
		 * creer un article ajouter article a la BDD afficher article dans onglet Vente
		 * creer option supprimer vente
		 * 
		 * 2/encherir connection utilisateur autre que vendeur si solde compte
		 * utilisateur > prix enchere actuel = autorisé encherir a un prix > prix actuel
		 * si solde inférieur = refus enchere
		 * 
		 * 
		 * 
		 * 3/fin de l'enchere si Date==DateFinEnchere --> fin de l'enchere le dernier
		 * utilisateur a avoir misé remporte l'enchere envoie de l'article à l'adresse
		 * de retrait
		 * 
		 * 4/ fermeture de l'enchere Utilisateur qui fait l'acquisition valide avoir
		 * reçu l'article argent versé au vendeur direictement du compte de l'acquerreur
		 * fermeture de l'enchere
		 * 
		 * 
		 * 
		 */
	}

//}
