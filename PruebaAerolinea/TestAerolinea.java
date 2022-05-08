package ar.edu.unlam.pb2.PruebaAerolinea;

import static org.junit.Assert.assertEquals;


import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import ar.edu.unlam.pb2.Aerolinea.Aerolinea;
import ar.edu.unlam.pb2.Aerolinea.Avion;
import ar.edu.unlam.pb2.Aerolinea.Pasajeros;
import ar.edu.unlam.pb2.Aerolinea.Persona;
import ar.edu.unlam.pb2.Aerolinea.Piloto;
import ar.edu.unlam.pb2.Aerolinea.T_C_P;
import ar.edu.unlam.pb2.Aerolinea.TipoAvion;
import ar.edu.unlam.pb2.Aerolinea.Vuelos;

public class TestAerolinea {

	@Test
	public void queSePuedaCrearUnaAerolinea() {
	
	String nombreDeLaAerolinea = "FlyBondi";
	
	Aerolinea aerolineaNueva = new Aerolinea();
	Aerolinea aerolineaCreada = aerolineaNueva.crearAerolinea(nombreDeLaAerolinea);
	String aerolineaEsperada = nombreDeLaAerolinea;
	
	assertEquals(aerolineaEsperada, aerolineaCreada.getNombreDeLaAerolinea());
		
	}
	
	
	@Test
	public void queSePuedaCrearUnVuelo() {
		
        LocalDate fechaIngresada = LocalDate.now();
        LocalTime horaIngresada = LocalTime.now();
        String ciudadDeEscala = "";
		Integer numeroDeVuelo = 2;
		
		Vuelos primerVuelo = new Vuelos();
		Vuelos vueloCreado = primerVuelo.crearUnVuelo(horaIngresada,ciudadDeEscala,numeroDeVuelo,fechaIngresada);
		
		assertEquals(vueloCreado.getCiudadDeEscala(),ciudadDeEscala);
		assertEquals(vueloCreado.getFecha(),fechaIngresada);
		
	}
	
	@Test
	public void queSePuedaPuedaCrearElAvion() {
		
		Integer modeloDelAvion = 0;
		Integer capacidad = 40;
		Integer capacidadDelAvion = capacidad;
		TipoAvion tiposDeAviones = TipoAvion.BOING_747;
		Integer hangar = 0;
		Integer cantidadDeAsientosLibres = 0;
		
		Avion primerAvion = new Avion();
		
		Avion avionCreado = primerAvion.crearUnAvion(modeloDelAvion,capacidadDelAvion,tiposDeAviones,hangar,cantidadDeAsientosLibres);
		avionCreado.getTiposDeAviones();
		
		assertEquals(TipoAvion.BOING_747, tiposDeAviones);
		
		
	}
	
	@Test
	public void queSePuedaAsignarAvionAlvuelo() {
		
		Integer modeloDelAvion = 0;
		Integer capacidad = 1;
		Integer capacidadDelAvion=capacidad;
		TipoAvion tiposDeAviones = TipoAvion.BOING_747;
		Integer hangar = 0;
		Integer cantidadDeAsientosLibres = 0;
		
		Vuelos primerVuelo = new Vuelos();
		Aerolinea aerolineaNueva = new Aerolinea();
		
		Avion primerAvion = new Avion(modeloDelAvion, capacidadDelAvion, tiposDeAviones, hangar, cantidadDeAsientosLibres);
		
		aerolineaNueva.agregarUnAvionAlVuelo(primerAvion,primerVuelo);

		Integer valorEsperado = 1;
		Integer valorObtenido = primerVuelo.getCantidadDeAviones();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test
	public void queAlVueloSeLePuedaAsignarUnPiloto() {
		
		Integer idDelPiloto = 1;
		String tipoDeAvion = "747";
		Integer cantidadDeHoras = 2;
		
		Vuelos primerVuelo = new Vuelos();
		
		Persona piloto1 = new Piloto(idDelPiloto, cantidadDeHoras, tipoDeAvion);
		
		primerVuelo.agregarPersonal(piloto1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = primerVuelo.cantidadDePilotos();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queAlVueloNoSeLePuedaAsignarMasDeUnPiloto() {
		
		Integer idDelPiloto = 1;
		String tipoDeAvion = "747";
		Integer cantidadDeHoras = 2;
		
		Vuelos primerVuelo = new Vuelos();
		
		Persona piloto1 = new Piloto(idDelPiloto, cantidadDeHoras, tipoDeAvion);
		
		primerVuelo.agregarPersonal(piloto1);
		
		Integer valorEsperado = 3;
		Integer valorObtenido = primerVuelo.cantidadDePilotos();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queAlVueloNoSeLePuedaAsignarMasDeCuatroAsafatas() {
		
		String nombre = "Flor";
		String apellido = "ci";
		String areaAsignada = "nose";
		
		Vuelos primerVuelo = new Vuelos();
		
		Persona asafata1 = new T_C_P(nombre,apellido,areaAsignada);
		
		primerVuelo.agregarPersonal(asafata1);
		primerVuelo.agregarPersonal(asafata1);
		primerVuelo.agregarPersonal(asafata1);
		primerVuelo.agregarPersonal(asafata1);
		primerVuelo.agregarPersonal(asafata1);
		
		Integer valorEsperado = 5;
		Integer valorObtenido = primerVuelo.cantidadDeT_C_P();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	
	
	@Test
	public void queSePuedaSubirUnPasajeroAlVuelo() {
		
		String nombre = "Maxi";
		String apellido = "Rabenko";
		Integer dni = 37609434;
		Double pasaporte = 20.376094341;
		
		Vuelos primerVuelo = new Vuelos();
		
		Persona pasajero1 = new Pasajeros(nombre,apellido,pasaporte,dni);
		
		primerVuelo.agregarPasajeroAlVuelo(pasajero1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = primerVuelo.getCantidadDePasajeros();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaAsignarUnAsientoDelVueloAUnPasajero() {
		
		String nombre = "Maxi";
		String apellido = "Rabenko";
		Integer dni = 37609434;
		Double pasaporte = 20.376094341;
		
		Vuelos primerVuelo = new Vuelos();
		
		Persona pasajero1 = new Pasajeros(nombre,apellido,pasaporte,dni);
		
		primerVuelo.asignarUnAsientoAUnPasajero(pasajero1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = primerVuelo.cantidadDeAsientos();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queNoSePuedaAsignarMasPasajerosQueLaCapacidadDelAvion() {
		
		String nombre = "Maxi";
		String apellido = "Rabenko";
		Integer dni = 37609434;
		Double pasaporte = 20.376094341;
		
		Vuelos primerVuelo = new Vuelos();
		
		Persona pasajero1 = new Pasajeros(nombre,apellido,pasaporte,dni);
		
		primerVuelo.asignarUnAsientoAUnPasajero(pasajero1);
		primerVuelo.asignarUnAsientoAUnPasajero(pasajero1);
		primerVuelo.asignarUnAsientoAUnPasajero(pasajero1);
		
		Integer valorEsperado = 3;
		Integer valorObtenido = primerVuelo.cantidadDeAsientos();
		
		assertEquals(valorEsperado,valorObtenido);
	}
}
