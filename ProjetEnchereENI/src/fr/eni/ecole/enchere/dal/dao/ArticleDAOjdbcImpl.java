package fr.eni.ecole.enchere.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.ecole.enchere.bo.Article;
import fr.eni.ecole.enchere.dal.ArticleDAO;
import fr.eni.ecole.enchere.dal.ConnectionDB;

public class ArticleDAOjdbcImpl implements ArticleDAO {
	private final String ARTICLE = "INSERT INTO ARTICLES_VENDUS (no_article,nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) VALUES (?????????);";

	public Article AjouterVente(Article article) throws SQLException {
		Connection cnx;

		cnx = ConnectionDB.getConnection();

		PreparedStatement pstmt = null;
;
		pstmt = cnx.prepareStatement(ARTICLE);
		pstmt.setString(2, article.getNom());
		pstmt.setString(3, article.getDescription());
		pstmt.setFloat(4, article.getPrix());
		pstmt.setLong(5, article.getStock());
		pstmt.setLong(6, article.getId());
//		pstmt.setDate(7, java.sql.Date.valueOf(java.time.LocalDate.now()));
//		pstmt.setDate(8, java.sql.Date.valueOf(article.getDateFin()));
		pstmt.setInt(9, article.getNoCategorie());
		
		
		
		
		pstmt.executeQuery();
		ResultSet rs = pstmt.executeQuery();
		cnx.close();
		return article;

	}


	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		
	}


}
