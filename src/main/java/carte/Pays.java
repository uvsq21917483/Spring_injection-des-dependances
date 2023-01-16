package carte;

import org.springframework.beans.factory.annotation.Value; 
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("config.properties")
public class Pays {

	@Value("${lieu}")
	String continent;


	@Value("France")
	String nom;

	public void affiche() {
		System.out.println(nom);
		System.out.println(continent);
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


}