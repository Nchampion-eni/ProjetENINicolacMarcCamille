package fr.eni.ecole.enchere.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.ecole.enchere.bo.Article;
import fr.eni.ecole.enchere.bo.Utilisateur;

public class ArticleDAOjdbcImpl {
	private final String ARTICLE = "INSERT INTO ARTICLES_VENDUS (no_article,nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) VALUES (?????????);";

	public Article AjouterVente(Article article) throws SQLException {
		Connection cnx;

		cnx = ConnectionDB.getConnection();

		PreparedStatement pstmt = null;

		pstmt = cnx.prepareStatement(ARTICLE);
		pstmt.setString(2, article.getNom());
		pstmt.setString(3, article.getDescription());
		pstmt.setFloat(4, article.getPrix());
		pstmt.setLong(5, article.getStock());
		pstmt.setLong(6, article.getId());
		pstmt.setString(7, article.getDateDebut());
		pstmt.setString(8, article.getDateFin());
		pstmt.setInt(9, article.getNoCategorie());
		pstmt.executeQuery();
		ResultSet rs = pstmt.executeQuery();
		cnx.close();
		return article;

	}

	public void Insert(Article article) {
	}
}
