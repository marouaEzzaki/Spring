package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;

public class DaoPelicula {
	private List<Pelicula> listaPelicula = new ArrayList<Pelicula>();
	private int numeroMaximoPeliculas;
	
	/**
	 * Metodo que inserta una pelicula a la lista
	 * @param p la pelicula a insertar
	 * @return true en caso correcto, false en caso de que el array
	 * este lleno
	 */
	public boolean insertar(Pelicula p) {
		if(listaPelicula.size() < numeroMaximoPeliculas) {
			listaPelicula.add(p);
			return true;
		}
		return false;
	}
	
	public List<Pelicula> listar(){
		return listaPelicula;
	}

	
	/*
	 * Los getters y setters para inyectar las dependecias
	 */
	public List<Pelicula> getListaPelicula() {
		return listaPelicula;
	}

	public void setListaPelicula(List<Pelicula> listaPelicula) {
		this.listaPelicula = listaPelicula;
	}

	public int getNumeroMaximoPeliculas() {
		return numeroMaximoPeliculas;
	}

	public void setNumeroMaximoPeliculas(int numeroMaximoPeliculas) {
		this.numeroMaximoPeliculas = numeroMaximoPeliculas;
	}
	
}
