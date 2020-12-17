package fr.eni.ecole.enchere.ihm;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ecole.enchere.bo.Article;
import fr.eni.ecole.enchere.dal.dao.ArticleDAOjdbcImpl;

/**
 * Servlet implementation class ServletGerantLesVentes
 */
@WebServlet("/ServletGerantLesVentes")
public class ServletGerantLesVentes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletGerantLesVentes() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Algo : 1/Creer une enchere connection utilisateur creer un article ajouter
	 * article a la BDD afficher article dans onglet Vente creer option supprimer
	 * vente
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

		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Vente.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/**
		 * creer un article ajouter article a la BDD afficher article dans onglet Vente
		 */

		String Nom = request.getParameter("nom");
		Integer categorie = Integer.parseInt(request.getParameter("categorie"));
		float prix = Float.parseFloat(request.getParameter("prix"));
		Integer stock = Integer.parseInt(request.getParameter("stock"));
		String description = request.getParameter("description");

		LocalDate dateDebut= LocalDate.now();
		LocalDate dateFin = LocalDate.parse(request.getParameter("dateFin"));
		int no_utilisateur = 1;
		// simpleDateFromat
		Article article = new Article(Nom, prix, stock, dateDebut, dateFin, categorie, description);
System.out.println(article.toString());
		HttpSession session = request.getSession();

		session.setAttribute("Nom", Nom);
		session.setAttribute("prix", prix);
		session.setAttribute("stock", stock);
		session.setAttribute("dateDebut", dateDebut);
		session.setAttribute("dateFin", dateFin);
		session.setAttribute("categorie", categorie);
		session.setAttribute("description", description);
		session.setAttribute("no_utilisateur", no_utilisateur);
		if (Nom != null || dateFin != null || stock != null) {

			ArticleDAOjdbcImpl articleDao = new ArticleDAOjdbcImpl();
			// ArticleDAO art = new ArticleDAO();
			try {
				articleDao.AjouterVente(article);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			articleDao.insert(article);
			request.setAttribute("article", article);
			request.getRequestDispatcher("/WEB-INF/jsp/afficherVente.jsp").forward(request, response);
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
