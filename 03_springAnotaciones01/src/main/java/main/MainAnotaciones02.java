package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfiguracionSpring;
import modelo.entidad.Pelicula;

/**
 * En este ejemplo vamos a dar de alta el contexto de spring mediante una clase
 * en vez de mediante XML
 */
public class MainAnotaciones02 {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		
		//invocando una case que busca anotaciones de spring en ese paquete 
		context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		
		Pelicula p = context.getBean("pelicula" , Pelicula.class);
		
		System.out.println(p);
		
		
	}
}
