package ar.edu.unlam.pb2.Aerolinea;

public class Pasajeros extends Persona{

	
	private String nombre, apellido;
	private Integer dni;
	private Double pasaporte;

	public Pasajeros(String nombre, String apellido, Double pasaporte, Integer dni) {
		super(nombre, apellido, pasaporte,dni);
	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Double pasaporte) {
		this.pasaporte = pasaporte;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Pasajeros [nombre=" + nombre + ", apellido=" + apellido + ", pasaporte=" + pasaporte + ", dni=" + dni
				+ "]";
	}

	
}
