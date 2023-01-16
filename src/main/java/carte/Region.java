package carte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Region {
	
	@Autowired
	private Pays pays;

	@Autowired
	Ville ville;


	public void affiche() {
		System.out.println("pays");
		pays.affiche();
		ville.affiche();
	}

	// setters 
	public void setVille(Ville ville) {
		this.ville = ville;
	}


	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}




}