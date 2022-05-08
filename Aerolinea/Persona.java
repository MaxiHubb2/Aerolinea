package ar.edu.unlam.pb2.Aerolinea;


public abstract class Persona {
	
	private String nombre,apellido;
	private Integer dni;
	
	private String areaAsignada;
	private Integer cantHoras,idPiloto,idAsafata;
	private String tipoAvion;
	


	public Persona(String nombre, String apellido, Integer dni, String areaAsignada, Integer cantHoras,
			Integer idPiloto, Integer idAsafata, String tipoAvion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.areaAsignada = areaAsignada;
		this.cantHoras = cantHoras;
		this.idPiloto = idPiloto;
		this.idAsafata = idAsafata;
		this.tipoAvion = tipoAvion;
	}

	public Persona(Integer dni2, Integer cantHoras2, String tipoAvion2) {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre2, String apellido2, Double pasaporte, Integer dni2) {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre2, String apellido2, String areaAsignada2) {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", areaAsignada="
				+ areaAsignada + ", cantHoras=" + cantHoras + ", idPiloto=" + idPiloto + ", idAsafata=" + idAsafata
				+ ", tipoAvion=" + tipoAvion + "]";
	}
	
	
}
