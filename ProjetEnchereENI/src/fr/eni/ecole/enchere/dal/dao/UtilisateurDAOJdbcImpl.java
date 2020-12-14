package fr.eni.ecole.enchere.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.ecole.enchere.bo.Utilisateur;


public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {
	
	//Requête pour vérifier connection utilisateur 
	//private final static String PSEUDO_MDP = "SELECT * FROM utilisateurs where pseudo=? and mot_de_passe=?;";
	private final static String VERIF_PSEUDO_MDP_EMAIL = "SELECT * FROM utilisateurs where (pseudo = ? or  email=? ) and mot_de_passe=?;";//mettre les colonnes en java 
	
	
	
	private Utilisateur getUser(ResultSet rs, Utilisateur user) throws SQLException {
		
		user.setId(rs.getInt(1));
		user.setPseudo(rs.getString(2));
		user.setNom(rs.getString(3));
		user.setPrenom(rs.getString(4));
		user.setEmail(rs.getString(5));
		user.setTelephone(rs.getString(6));
		user.setRue(rs.getString(7));
		user.setCodePostal(rs.getString(8));
		user.setVille(rs.getString(9));
		user.setMotDePasse(rs.getString(10));
		user.setCredit(rs.getInt(11));
		user.setAdministrateur(rs.getString(12));
		
		return user;
	}
	
	
	public Utilisateur verifPseudoMdpEmail(String identifiant, String mdp) {
		Utilisateur user = new Utilisateur();
		
		try(Connection cnx = ConnectionDB.getConnection())
		{						
			PreparedStatement pstmt = cnx.prepareStatement( VERIF_PSEUDO_MDP_EMAIL);
			pstmt.setString(1,identifiant);
			pstmt.setString(3, mdp);
			pstmt.setString(2, identifiant);
			pstmt.executeQuery();
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				user = getUser(rs, user);
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//Exception ??
		}	
		return null;
	}


	public void Insert(Utilisateur user) {
		
	}

}




