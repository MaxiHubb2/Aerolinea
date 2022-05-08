package ar.edu.unlam.pb2.Aerolinea;

public class T_C_P extends Persona{
	
	private String nombre,apellido,areaAsignada; 
	

	public T_C_P(String nombre, String apellido, String areaAsignada) {
		super(nombre, apellido, areaAsignada);
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

	public String getAreaAsignada() {
		return areaAsignada;
	}

	public void setAreaAsignada(String areaAsignada) {
		this.areaAsignada = areaAsignada;
	}


	@Override
	public String toString() {
		return "T_C_P [nombre=" + nombre + ", apellido=" + apellido + ", areaAsignada=" + areaAsignada + "]";
	}
	
}
