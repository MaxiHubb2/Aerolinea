package ar.edu.unlam.pb2.Aerolinea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vuelos{

	private static final int capacidadDelAvion = 2;
	private LocalTime hora = LocalTime.now();
	private LocalDate Fecha = LocalDate.now();
	private String ciudadDeEscala = "";
	private Integer numeroDeVuelo = 0;
	private ArrayList <Avion> avionesAIngresar;
	private ArrayList<Persona> personas;
	private ArrayList <Pasajeros> pasajerosAIngresar;
	
	
	public Vuelos() {
		this.avionesAIngresar = new ArrayList<>();
		this.personas = new ArrayList<>();
		this.pasajerosAIngresar = new ArrayList<>();
	}
	
	
	public Vuelos(LocalTime hora, LocalDate fecha, String ciudadDeEscala, Integer numeroDeVuelo) {
		super();
		this.avionesAIngresar = new ArrayList<>();
		this.personas = new ArrayList<>();	
		this.pasajerosAIngresar = new ArrayList<>();
	}

		public Vuelos crearUnVuelo(LocalTime hora, String ciudadDeEscala2, Integer numeroDeVuelo2, LocalDate fecha) {
		// TODO Auto-generated method stub
		
		Vuelos vueloCreado = new Vuelos();
		
		vueloCreado.setHora(hora);
		vueloCreado.setFecha(fecha);
		vueloCreado.setCiudadDeEscala(ciudadDeEscala);
		vueloCreado.setNumeroDeVuelo(numeroDeVuelo);
		
		return vueloCreado;
	}
	
	public void agregarPasajeroAlVuelo(Persona pasajero1) {
			// TODO Auto-generated method stub
		this.pasajerosAIngresar.add((Pasajeros) pasajero1);
	}
	
	public Integer getCantidadDePasajeros() {
		
		return this.pasajerosAIngresar.size();
	}
	
	public void setAvion(Avion avionIngresado) {

		this.avionesAIngresar.add(avionIngresado);
	}
	
	public Integer getCantidadDeAviones() {
		
		return this.avionesAIngresar.size();
	}
		
	public LocalDate getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

	
	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime Hora) {
		this.hora = Hora;
	}

	public String getCiudadDeEscala() {
		return ciudadDeEscala;
	}

	public void setCiudadDeEscala(String ciudadDeEscala) {
		this.ciudadDeEscala = ciudadDeEscala;
	}

	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}


	public Avion buscarVuelo(Integer modeloDelAvion) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < avionesAIngresar.size(); i++) {
			if(this.avionesAIngresar.get(i).getModeloDelAvion().equals(modeloDelAvion)) {
				return this.avionesAIngresar.get(i);
			}
		}
		return null;
	}
	
	public Boolean asignarUnAsientoAUnPasajero(Persona pasajero1) {
		// TODO Auto-generated method stub
		Boolean sePudoAsignarAsiento = false;
		
			if(pasajero1 instanceof Pasajeros) {
				if(cantidadDeAsientos()<capacidadDelAvion) {
					personas.add(pasajero1);
					sePudoAsignarAsiento = true;
				
				}
				
		}return sePudoAsignarAsiento;
		
	}
	
	public Boolean agregarPersonal(Persona tipoDePersonaElegida) {
		Boolean sePudoAgregarPiloto = false;
		Boolean sePudoAgregarT_C_P = false;
				
		if(tipoDePersonaElegida instanceof Piloto) {
			if(cantidadDePilotos()<2) {
				personas.add((Piloto) tipoDePersonaElegida);
				sePudoAgregarPiloto = true;	
		}
					
	}
		if(tipoDePersonaElegida instanceof T_C_P) {
			if(cantidadDeT_C_P()<4) {
				personas.add((T_C_P) tipoDePersonaElegida);
				sePudoAgregarT_C_P = true;	
		}
					
	}
		return sePudoAgregarPiloto&&sePudoAgregarT_C_P;
				
}
	

	public Integer cantidadDeT_C_P() {
		Integer cantidadDeT_C_P = 0;
		
		for (Persona t_C_P : personas) {
			if(t_C_P instanceof T_C_P) {
				cantidadDeT_C_P++;
				
			}
			
		}return cantidadDeT_C_P;
	}
	
	public Integer cantidadDePilotos() {
		Integer cantidadDePilotos = 0;
		
		for (Persona pilotos : personas) {
			if(pilotos instanceof Piloto) {
				cantidadDePilotos++;
				
			}
			
		}return cantidadDePilotos;
	}
	
	public Integer cantidadDeAsientos() {
		Integer cantidadDeAsientosTotales = 0;
		
		for (Persona asientos : personas) {
			if(asientos instanceof Pasajeros) {
				cantidadDeAsientosTotales++;
			}
		}
		return cantidadDeAsientosTotales;
	}
	
	

	
	@Override
	public String toString() {
		return "Vuelos [fechaYHora=" + hora + ", ciudadDeEscala=" + ciudadDeEscala + ", numeroDeVuelo="
				+ numeroDeVuelo + "]";

	}


	

	
	
	
}
