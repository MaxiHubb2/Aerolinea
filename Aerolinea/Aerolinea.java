package ar.edu.unlam.pb2.Aerolinea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Aerolinea  {

	private String nombreDeLaAerolinea;
	
	
	public Aerolinea(LocalTime hora, LocalDate fecha, String ciudadDeEscala, Integer numeroDeVuelo) {
		// TODO Auto-generated constructor stub
		super();
	}

	public Aerolinea() {
		
	}

	public Aerolinea crearAerolinea(String nombreDeLaAerolinea) {
		// TODO Auto-generated method stub
		
		Aerolinea aero1 = new Aerolinea();
		aero1.setNombreDeLaAerolinea(nombreDeLaAerolinea);
		return aero1;
	}
	
	public String getNombreDeLaAerolinea() {
		return nombreDeLaAerolinea;
	}

	public void setNombreDeLaAerolinea(String nombreDeLaAerolinea) {
		this.nombreDeLaAerolinea = nombreDeLaAerolinea;
	}

	public void agregarUnAvionAlVuelo(Avion primerAvion, Vuelos primerVuelo) {
		// TODO Auto-generated method stub
		primerVuelo.setAvion(primerAvion);
	}


	
	

		
}
