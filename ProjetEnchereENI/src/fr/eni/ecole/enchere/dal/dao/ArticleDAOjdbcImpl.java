package fr.eni.ecole.enchere.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import fr.eni.ecole.enchere.bo.Article;
import fr.eni.ecole.enchere.dal.ArticleDAO;
import fr.eni.ecole.enchere.dal.ConnectionDB;

public class ArticleDAOjdbcImpl implements ArticleDAO {
	private final String ARTICLE = "INSERT INTO ARTICLES_VENDUS (nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_categorie,no_utilisateur) VALUES (?,?,?,?,?,?,?,?);";

	public Article AjouterVente(Article article) throws SQLException {
		Connection cnx;

		cnx = ConnectionDB.getConnection();

		PreparedStatement pstmt = null;
;
		pstmt = cnx.prepareStatement(ARTICLE);
		pstmt.setString(1, article.getNom());
		pstmt.setString(2, article.getDescription());
		pstmt.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
		pstmt.setDate(4, java.sql.Date.valueOf(article.getDateFin()));
		pstmt.setFloat(5, article.getPrix());
		pstmt.setFloat(6, article.getPrix());
		pstmt.setInt(7, article.getNoCategorie());
		pstmt.setInt(8, 1);
		pstmt.executeQuery();
		pstmt.close();
		cnx.close();
		
		return article;

		
	}


	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		
	}


}
