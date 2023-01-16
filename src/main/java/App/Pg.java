package App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(RegionConfig.class);
		Region regionBean = context.getBean( Region.class);	     	
	    regionBean.afficher();


	}

}
