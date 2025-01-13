package configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;

@Configuration
public class ConfiguracionSpring {
	
	//cada metodo que hagamos con el @bean va a ser un bean
	
	@Bean
	@Scope("prototype")
	//<bean id="director" class="modelo.entidad.Director" scope="prototype">
	public Director director() {
		Director d = new Director();
		//<property name="nombre" value="Steven Spielberg"/>
		d.setNombre("Steven Spielberg");
		
		//return new Director();
		return d;
	}
	
	@Bean
	@Scope("prototype")
	//si existe un bean de tipo director dentro del contexto de Spring
	//se inyectaria a traves del parametro. En este caso entraría el 
	//bean cuyo nombre es "Steven Spielberg"
	public Pelicula pelicula1(Director director) {
		Pelicula pelicula = new Pelicula();
		pelicula.setDirector(director);
		pelicula.setTitulo("pelisss");
		pelicula.setGenero("Sci-Fi");
		
		return pelicula;
	}
	
	@Bean
	public Pelicula pelicula2() {
		Director d = new Director();
		d.setNombre("George Lucas");
		
		Pelicula p = new Pelicula();
		
		p.setDirector(d);
		p.setTitulo("La guerra de las galaxias");
		
		
		return p;		
	}

	@Bean
	public DaoPelicula daoPelicula() {
		DaoPelicula daoPelicula = new DaoPelicula();
		daoPelicula.setListaPelicula(new ArrayList<Pelicula>());
		daoPelicula.setNumeroMaximoPeliculas(2);
		
		return daoPelicula;
	}
	@Bean
	//si existe algun objeto de tipo daopelicula me lo inyectas por ahi 
	public GestorPelicula gestorPelicula(DaoPelicula daoPelicula) {
		GestorPelicula gestorPelicula = new GestorPelicula();
		gestorPelicula.setDaoPelicula(daoPelicula);
		return gestorPelicula;
	}
	
	
}
