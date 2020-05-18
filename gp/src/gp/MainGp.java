package gp;

import java.util.ArrayList;
import java.util.Random;

public class MainGp {

	static ArrayList <Coche> podioList = new ArrayList<Coche>();

	public static void main(String[] args) {

		//Japan
		Coche cocheUno = new Coche("Toyota", "Rojo", "Japan");
		Coche cocheDos = new Coche("Honda", "Blanco", "Japan");

		//Se crea un array de coches para garaje uno
		ArrayList<Coche> cochesGarajeJapan = new ArrayList();

		//Se añaden los coches al array
		cochesGarajeJapan.add(cocheUno);
		cochesGarajeJapan.add(cocheDos);
		Garaje garajeJapan = new Garaje("Japan Racing", cochesGarajeJapan);	

		//Usa
		Coche cocheTres = new Coche("Ford", "Azul", "Usa");
		Coche cocheCuatro = new Coche("Chrysler", "verde", "Usa");

		ArrayList<Coche> cochesGarajeUsa = new ArrayList<Coche>();

		//Se añaden los coches al array
		cochesGarajeUsa.add(cocheTres);
		cochesGarajeUsa.add(cocheCuatro);
		Garaje garajeUsa = new Garaje("USA Motors", cochesGarajeUsa);

		//Reino unido
		Coche cocheCinco = new Coche("Volvo", "Rosa", "Uk");
		Coche cocheSeis = new Coche("Aston Martin", "Amarillo", "Uk");

		ArrayList<Coche> cochesGarajeUk = new ArrayList<Coche>();

		//Se añaden los coches al array
		cochesGarajeUk.add(cocheCinco);
		cochesGarajeUk.add(cocheSeis);
		Garaje garajeUk = new Garaje("UK Touring cars", cochesGarajeUk);


		//Se crea una carrera estandar y se añaden varios garajes
		Estandar carreraEstandar = new Estandar();
		carreraEstandar.setNombreCarrera("Indeanapolis");
		carreraEstandar.setDistancia(100);

		ArrayList<Garaje> garajesIndianapolis = new ArrayList<Garaje>();
		garajesIndianapolis.add(garajeJapan);
		garajesIndianapolis.add(garajeUsa);
		carreraEstandar.setListaGarajes(garajesIndianapolis);

		//Carrera eliminacion
		Eliminacion carreraEliminacion = new Eliminacion();
		carreraEliminacion.setNombreCarrera("Laguna Seca");
		carreraEliminacion.setDistancia(80);

		ArrayList<Garaje> garajesLagunaSeca= new ArrayList<Garaje>();
		garajesLagunaSeca.add(garajeUk);
		carreraEliminacion.setListaGarajes(garajesLagunaSeca);

		//Torneo
		Torneo torneoUno = new Torneo();
		torneoUno.setNombreTorneo("Grand Prix");

		ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>();
		listaCarreras.add(carreraEliminacion);
		listaCarreras.add(carreraEstandar);
		torneoUno.setListCarreras(listaCarreras);


		//Funciones
		listarCarrerasTorneo(torneoUno);
		iniciarCarreraIndianapolis(carreraEstandar);

	}

	private static void listarCarrerasTorneo(Torneo torneo) {
		System.out.println("Torneo: " + torneo.getNombreTorneo());
		System.out.println("++++++++++++++++++");
		System.out.println("# Carreras : ");
		for(Carrera c : torneo.getListCarreras()) {
			System.out.println(c.nombreCarrera + " con una distancia de :" + c.getDistancia());
		}

	}

	private static void iniciarCarreraIndianapolis(Estandar carreraEstandar) {

		System.out.println("-------------------------");
		System.out.println(" # Empieza la temporada!!!!");
		System.out.println("Prueba de " + carreraEstandar.getNombreCarrera());

		//Participan dos coches, uno cada garaje
		Garaje garajeUno = carreraEstandar.getListaGarajes().get(0);
		Garaje garajeDos = carreraEstandar.getListaGarajes().get(1);

		//Coches que participan:
		Coche cocheUno = garajeUno.getListaCoches().get(0);
		Coche cocheDos = garajeDos.getListaCoches().get(0);
		Coche cocheTres = garajeDos.getListaCoches().get(1);

		ArrayList <Coche> cochesCarrera = new ArrayList<Coche>();
		cochesCarrera.add(cocheUno);
		cochesCarrera.add(cocheDos);
		cochesCarrera.add(cocheTres);

		generadorCarreraEstandar(cochesCarrera, carreraEstandar.getDistancia());
	}

	private static void generadorCarreraEstandar(ArrayList <Coche> cochesCarrera, int distancia) {
		System.out.println("Participan : " 	);

		for(Coche c : cochesCarrera) {
			System.out.println(c.getNombre() + " ----");	
			int sumaVelocidad = 0;
			//Se calcula el total de la velocidad de la carrera por el numero total de vueltas (distancia)
			for(int i = 0; i<distancia; i++) {
				sumaVelocidad = sumaVelocidad + getRandomNumberInRange();
			}
			c.setVelocidad(sumaVelocidad);
		}

		generarPodio(cochesCarrera);

	}

	private static void generarPodio(ArrayList<Coche> cochesCarrera) {
		System.out.println("##################");

		if(cochesCarrera.get(0).getVelocidad() > cochesCarrera.get(1).getVelocidad() &&
				cochesCarrera.get(0).getVelocidad() > cochesCarrera.get(2).getVelocidad()) {
			System.out.println(" Ganador !!! --> " + cochesCarrera.get(0).getNombre() + " con media de " + cochesCarrera.get(0).getVelocidad() + " km/h");
		}else if(cochesCarrera.get(1).getVelocidad() > cochesCarrera.get(0).getVelocidad() &&
				cochesCarrera.get(1).getVelocidad() > cochesCarrera.get(2).getVelocidad()) {
			System.out.println(" Ganador !!! --> " + cochesCarrera.get(1).getNombre() + " con media de " + cochesCarrera.get(1).getVelocidad() + " km/h");
		}else {
			System.out.println(" Ganador !!! --> " + cochesCarrera.get(2).getNombre() + " con media de " + cochesCarrera.get(0).getVelocidad() + " km/h");
		}

	}

	
	//Generador automático de velocidad
	private static int getRandomNumberInRange() {

		int min =  0;
		int max = 5;

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
