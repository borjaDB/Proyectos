package gp;

import java.util.ArrayList;

public class Torneo {
	
	String nombreTorneo;
	
	ArrayList<Carrera>carrerasList;

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}

	public ArrayList<Carrera> getListCarreras() {
		return carrerasList;
	}

	public void setListCarreras(ArrayList<Carrera> lista) {
		this.carrerasList = lista;
	}
	
}
