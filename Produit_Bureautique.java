package Models;

public class Produit_Bureautique extends Produit{
	
	private final double tva = 1.19;
	
	public Produit_Bureautique(int ref, int quantite, String nom, String description, String fournisseur,
			double prixht) {
		super(ref, quantite, nom, description, fournisseur, prixht);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Produit_Bureautique [tva=" + tva +" "+ super.toString() +"]";
	}


	@Override
	public double calculer_ttc() {
		// TODO Auto-generated method stub
		return this.prixht*this.tva;
	}
	
}

