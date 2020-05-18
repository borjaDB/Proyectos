package gp;

import java.util.ArrayList;

public class Garaje {
	
	String nombre;
	ArrayList<Coche> listaCoches;
	
	
	public Garaje(String nombre, ArrayList listaCoches) {
		super();
		this.nombre = nombre;
		this.listaCoches = listaCoches;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Coche> getListaCoches() {
		return listaCoches;
	}
	public void setListaCoches(ArrayList<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}

	
	

}
