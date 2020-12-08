package fr.eni.ecole.enchere.bo;

import java.util.Date;

public class Enchere {
	private Article article;
	private Date dateEnchere;
	private float montantEnchere;

	public Enchere() {
	}

	public Enchere(Article article, Date dateEnchere, float montantEnchere) {
		super();
		this.article = article;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public float getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(float montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	@Override
	public String toString() {
		return "Enchere [article=" + article + ", dateEnchere=" + dateEnchere + ", montantEnchere=" + montantEnchere
				+ "]";
	}

}
