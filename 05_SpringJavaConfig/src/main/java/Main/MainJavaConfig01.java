package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfiguracionSpring;
import modelo.entidades.Pelicula;

public class MainJavaConfig01 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		
		Pelicula p = context.getBean("pelicula1", Pelicula.class);
		
		System.out.println(p);
		
		
		
		
	}

}
