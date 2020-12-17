package fr.eni.ecole.enchere;

import java.util.ArrayList;
import java.util.List;

public class BusinessException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private List<String> listeErreur;
	
	public BusinessException() {
		listeErreur=new ArrayList<>();
	}
	
	
	public List<String> getErreur(){
		return listeErreur;
	}
	
	
	public void ajouterErreur(String msg){
		listeErreur.add(msg);
	}
	
	
}
