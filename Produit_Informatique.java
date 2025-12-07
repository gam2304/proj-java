package Models;

public class Produit_Informatique extends Produit{
	private String couleur;
	private final double tva=1.13;
	
	public Produit_Informatique(int ref, int quantite, String nom, String description, String fournisseur,
			double prixht, String couleur) {
		super(ref, quantite, nom, description, fournisseur, prixht);
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Produit_Informatique [couleur=" + couleur + ", tva=" + tva +" "+ super.toString() +"]";
	}

	@Override
	public double calculer_ttc() {
		// TODO Auto-generated method stub
		return this.prixht*this.tva;
	}
	
	
}
