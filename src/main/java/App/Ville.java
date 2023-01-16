package App;

import org.springframework.beans.factory.annotation.Value;

public class Ville {
	
	@Value("Lille")
	private String ville;

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
