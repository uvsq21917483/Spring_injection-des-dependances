package App;

import org.springframework.beans.factory.annotation.Autowired;

public class Region {
	
	private String nomRegion;
	
	@Autowired
	private Ville capitaleRegion;
	
	@Autowired
	private Pays pays;
	
	public void afficher() {
		System.out.println(capitaleRegion.getVille());
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public Ville getCapitaleRegion() {
		return capitaleRegion;
	}

	public void setCapitaleRegion(Ville capitaleRegion) {
		this.capitaleRegion = capitaleRegion;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

}
