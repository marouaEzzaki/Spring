package modelo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Computer;

public class Main_Ordenador {
	
	public static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("context.xml");
		
		System.out.println(context.getBean("ordenador", Computer.class));
		
		
		
	}
}
