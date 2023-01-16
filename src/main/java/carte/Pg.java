package carte;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Pg {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("carte");  // le Package qui contient les components à scanner
		context.refresh();
	
		Region region = context.getBean( Region.class);
		region.affiche();

		context.close();
	}
}