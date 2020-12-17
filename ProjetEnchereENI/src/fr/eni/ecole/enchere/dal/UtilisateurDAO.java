package fr.eni.ecole.enchere.dal;

import fr.eni.ecole.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	
	public void  Insert (Utilisateur user);
	public Utilisateur verifPseudoMdpEmail(String pseudo, String mdp) throws Exception;

}

