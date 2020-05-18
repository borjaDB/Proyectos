package gp;

import java.util.ArrayList;

public  abstract class Carrera {
	
	String nombreCarrera;
	ArrayList <Garaje> listaGarajes;
	int distancia;
	
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public ArrayList<Garaje> getListaGarajes() {
		return listaGarajes;
	}
	public void setListaGarajes(ArrayList<Garaje> listaGarajes) {
		this.listaGarajes = listaGarajes;
	}

}
