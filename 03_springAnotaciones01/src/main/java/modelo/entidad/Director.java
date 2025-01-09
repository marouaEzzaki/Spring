package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Director {
	
	private String nombre;
	@Value(value = "18")
	//<property name="edad" value="18"/>  <---- todo tiene equivalencia con XML
	private int edad;
	
	//para asignar valores a los atributos se suele hacer en el constructor
	public Director() {
		super();
		this.nombre ="pepiño";
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
