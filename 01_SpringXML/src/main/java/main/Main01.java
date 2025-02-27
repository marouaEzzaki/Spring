package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class Main01 {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		
		//En este ejemplo vamos a trabajar con objetos dentro de Spring COntext
		//y los vamos a dar de alta mediante XML
		//Los objetos gestionados por el contexto de Spring se llaman "Beans"
		

		context = new ClassPathXmlApplicationContext("context01.xml");
		
		Persona p = (Persona) context.getBean("juan");
		p.setNombre("juancho");
		p.setPeso(28);
		p.setPeso(88.0);
		
		imprimir();
		
		
		p = context.getBean("pepe", Persona.class);
		System.out.println(p);
		System.out.println("fin del programa ...");
		
		
	}
	
	
	private static void imprimir() {
		System.out.println(context.getBean("juan"));
	}

}
