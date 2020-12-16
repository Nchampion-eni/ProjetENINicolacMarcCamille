package fr.eni.ecole.enchere.bo;

import java.time.LocalDate;

public class Article extends Categorie {
	private int id;
	private String nom;
	private float prix;
	private int stock;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private String description;

	public Article(String nom, float prix, int stock, LocalDate dateFin, int noCategorie,
			String description) {
		super(noCategorie);
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
			this.dateFin = dateFin;
		this.noCategorie = noCategorie;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
		return "Article [id=" + id + ", nom=" + nom + ", categorie=" + noCategorie + ", prix=" + prix + ", stock="
				+ stock + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}

}
