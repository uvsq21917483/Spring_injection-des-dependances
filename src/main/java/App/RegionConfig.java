package App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   
public class RegionConfig{

	@Bean	
	public Region beanRegion() {
		return new Region();
	}
	
	@Bean
	public Ville beanVille() {
		return new Ville();
	}
	
	@Bean
	public Pays beanPays() {
		return new Pays();
	}
}
