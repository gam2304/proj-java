package Models;

public abstract class Produit {
	protected int Ref,Quantite;
	protected String nom,description,fournisseur;
	protected double prixht;
	
	public int getRef() {
		return Ref;
	}
	//methode abstraite cad une méthode sans code
	public abstract double calculer_ttc();
	
	public void setRef(int ref) {
		Ref = ref;
	}
	public int getQuantite() {
		return Quantite;
	}
	public void setQuantite(int quantite) {
		Quantite = quantite;
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
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public double getPrixht() {
		return prixht;
	}
	public void setPrixht(double prixht) {
		this.prixht = prixht;
	}

	@Override
	public String toString() {
		return "Produit [Ref=" + Ref + ", Quantite=" + Quantite + ", nom=" + nom + ", description=" + description
				+ ", fournisseur=" + fournisseur + ", prixht=" + prixht + "]";
	}
	public Produit(int ref, int quantite, String nom, String description, String fournisseur, double prixht) {
		super();
		Ref = ref;
		Quantite = quantite;
		this.nom = nom;
		this.description = description;
		this.fournisseur = fournisseur;
		this.prixht = prixht;
	}
	
	
}
