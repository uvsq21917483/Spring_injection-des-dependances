package carte;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ville {
	@Value("Iille")
	String capitale;

	public String getCapitale() {
		return capitale;
	}

	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}
	
	public void affiche() {
		System.out.println("capitale " + capitale);
	}
}