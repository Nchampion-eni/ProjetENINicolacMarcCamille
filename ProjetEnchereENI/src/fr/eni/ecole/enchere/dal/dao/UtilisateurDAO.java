package fr.eni.ecole.enchere.dal.dao;

import fr.eni.ecole.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	public Utilisateur verifPseudoMdpEmail(String identifiant, String mdp);
	public void  Insert (Utilisateur user);

}
