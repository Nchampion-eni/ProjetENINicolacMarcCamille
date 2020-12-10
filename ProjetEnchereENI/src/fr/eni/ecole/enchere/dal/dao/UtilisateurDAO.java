package fr.eni.ecole.enchere.dal.dao;

import java.sql.PreparedStatement;

import fr.eni.ecole.enchere.bo.Utilisateur;

public class UtilisateurDAO {
	
	//Requête pour vérifier connection utilisateur 
	private final static String PSEUDO_MDP = "SELECT * FROM utilisateurs where pseudo=? and mot_de_passe=?;";
	
	public static Utilisateur PseudoMdp(String pseudo, String mdp) {
		Utilisateur u = new Utilisateur();
		
		//Connection cnx =
		
		//PreparedStatement pstmt = 
		return u;
		
	}

}
