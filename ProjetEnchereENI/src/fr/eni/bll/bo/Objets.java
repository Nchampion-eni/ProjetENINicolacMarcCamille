package fr.eni.bll.bo;

import java.util.Date;

public class Objets {
private int ID;
private String nom;
private float prix;
private int stock;
private String categorie;
private Date dateDebut = new Date();
private Date dateFin = new Date();
public Objets(int iD, String nom, float prix, int stock, String categorie, Date dateDebut, Date dateFin) {
	super();
	ID = iD;
	this.nom = nom;
	this.prix = prix;
	this.stock = stock;
	this.categorie = categorie;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
@Override
public String toString() {
	return "Objets [ ID = " + ID + ", nom = " + nom + ", prix = " + prix + ", stock = " + stock + ", categorie = " + categorie
			+ ", dateDebut = " + dateDebut + ", dateFin = " + dateFin + " ]";
}


}
