package fr.eni.ecole.enchere.ihm;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ecole.enchere.bo.Article;
import fr.eni.ecole.enchere.bo.Categorie;

/**
 * Servlet implementation class ServletGerantLesVentes 
 */
//@WebServlet("/ServletGerantLesVentes")
public class ServletGerantLesVentes extends HttpServlet {
	private static final long serialVersionUID = 1L;
public ServletGerantLesVentes() {
	// TODO Auto-generated constructor stub
}
	/*  Algo :
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
	
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 1/Creer une enchere connection utilisateur
		 */
		HttpSession session = request.getSession();
		if (session != null) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Vente.jsp").forward(request, response);
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/erreurConnection.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		/**
		 * creer un article ajouter article a la BDD afficher article dans onglet Vente
		 */

		
		
		
		
		String Nom = request.getParameter("Nom");
		String categorie = request.getParameter("Categorie");
		String prix = request.getParameter("prix");
		String stock = request.getParameter("stock");
		String dateFin    = request.getParameter("Date de fin");
		String Valider = request.getParameter("Valider");
		
		public Article article (String nom, float prix, int stock, Date dateDebut, Date dateFin, Categorie categorie) {
			this.Nom = nom;
			this.prix = prix;
			this.stock = stock;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.categorie = categorie;
		}
		
		HttpSession session = request.getSession(); 
		
		session.setAttribute("Nom", Nom);
		session.setAttribute("Categorie",categorie);
		session.setAttribute("Nom", Nom);
		session.setAttribute("Nom", Nom);
		session.setAttribute("Nom", Nom);
		session.setAttribute("Nom", Nom);
		
		if(Nom !=null || categorie != null || prix!=null || stock!=null || dateFin!=null) {
			
			article = null;
}else {
			
		}
	



				
				 /** 
				 * creer option supprimer vente
				 * 
				 * 
				 */
				
		/**
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

}
