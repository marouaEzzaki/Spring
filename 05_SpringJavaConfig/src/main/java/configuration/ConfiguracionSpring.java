package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;

@Configuration
public class ConfiguracionSpring {
	
	//cada metodo que hagamos con el @bean va a ser un bean
	
	@Bean
	@Scope("prototype")
	public Director director() {
		return new Director();
	}
	
	@Bean
	@Scope("prototype")
	public Pelicula pelicula1(Director director) {
		Pelicula pelicula = new Pelicula();
		pelicula.setDirector(director);
		pelicula.setTitulo("pelisss");
		
		return pelicula;
	}
}
