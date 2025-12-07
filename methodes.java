import java.util.ArrayList;
public class Gestionnaire {
	
	
	//creer une liste pour stocker les patients
	private ArrayList<Patient> liste_patients = new ArrayList<>();
	// une methode qui permet d'ajouter un nouveau avec le constructeur 
	public void ajouterPatient() {
		this.liste_patients.add(new Patient());

}
	public void afficherList() {
		for(int i=0;i<this.liste_patients.size();i++) {
			System.out.println(this.liste_patients.get(i).toString());
		}
}
	public Patient rechercherPatient(int cin) {
		for(Patient p : liste_patients) {
			if(p.getCin()==cin) return p;
		}
		return null;
	}
}
