package fr.eni.ecole.enchere.ihm;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import fr.eni.ecole.enchere.bo.Categorie;
import fr.eni.ecole.enchere.bo.Article;

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

		String Nom = (String) request.getAttribute("Nom");
		Integer categorie = (int) request.getAttribute("value");
		float prix = Float.parseFloat((String) request.getAttribute("prix"));
		Integer stock = Integer.parseInt((String) request.getAttribute("stock"));
		String description = (String) request.getAttribute("description");

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String dateDebut = request.getParameter("dateDebut");
		Date startDate = null;
		try {
			startDate = (Date) df.parse(dateDebut);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy");
		String dateFin = request.getParameter("dateFin");
		Date startDate2 = null;
		try {
			startDate = (Date) df.parse(dateFin);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		// simpleDateFromat
		Article article = new Article(Nom, prix, stock, dateDebut, dateFin, categorie, description);

		HttpSession session = request.getSession();

		session.setAttribute("Nom", Nom);
		session.setAttribute("value", categorie);
		session.setAttribute("prix", prix);
		session.setAttribute("stock", stock);
		session.setAttribute("dateDebut", dateDebut);
		session.setAttribute("dateFin", dateFin);
		session.setAttribute("description", description);

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
