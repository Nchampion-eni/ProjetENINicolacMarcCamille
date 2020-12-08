package fr.eni.ecole.enchere.bo;

import java.util.Date;

public class Article extends Categorie {
	private int id;
	private String nom;
	private Categorie categorie;
	private float prix;
	private int stock;
	private Date dateDebut = new Date();
	private Date dateFin = new Date();

	public Article() {
	}

	public Article(String nom, float prix, int stock, Date dateDebut, Date dateFin, Categorie categorie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int iD) {
		id = iD;
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

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", prix=" + prix + ", stock=" + stock
				+ ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}

}
