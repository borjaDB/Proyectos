package gp;

public class Coche{
	
	String nombre;
	String marca;
	String pegatinaGaraje;
	int velocidad;
	int puntos;

		
	public Coche(String nombre, String marca, String pegatinaGaraje) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.pegatinaGaraje = pegatinaGaraje;
	}
		
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPegatinaGaraje() {
		return pegatinaGaraje;
	}
	public void setPegatinaGaraje(String pegatinaGaraje) {
		this.pegatinaGaraje = pegatinaGaraje;
	}

}
