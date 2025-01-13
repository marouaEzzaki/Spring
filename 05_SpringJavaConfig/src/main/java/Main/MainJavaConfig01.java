package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfiguracionSpring;
import modelo.entidades.Pelicula;

//en este ejemplo usamos java config
public class MainJavaConfig01 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		
		Pelicula p = context.getBean("pelicula1", Pelicula.class);
		
		System.out.println(p);
		
		//este es objeto es singleton, el objeto va a ser el mismo 
		Pelicula p2 = context.getBean("pelicula2", Pelicula.class);
		System.out.println(p2);
		
		
		
	}

}
