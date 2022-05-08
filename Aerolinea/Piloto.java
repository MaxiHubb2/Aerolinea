package ar.edu.unlam.pb2.Aerolinea;


public class Piloto extends Persona{
	
	private String areaAsignada;
	private Integer cantHoras, idDelPiloto;
	private String tipoAvion;


	public Piloto(Integer cantidadDeHoras, Integer idPiloto2, String tipoAvion2) {
		// TODO Auto-generated constructor stub
		super(idPiloto2, cantidadDeHoras, tipoAvion2);
		
	}
	
	public Piloto crearUnPiloto(Integer cantidadDeHoras, Integer idPiloto, Integer tipoDeAvion) {
		// TODO Auto-generated method stub
		
		Piloto pilotoCreado = new Piloto(cantidadDeHoras, idPiloto, tipoAvion);
		
		pilotoCreado.setTipoAvion(tipoAvion);
		pilotoCreado.setCantHoras(cantidadDeHoras);
		pilotoCreado.setIdDelPiloto(idPiloto);
		
		return pilotoCreado;
	
	}
	
	public String getAreaAsignada() {
		return areaAsignada;
	}
	public void setAreaAsignada(String areaAsignada) {
		this.areaAsignada = areaAsignada;
	}
	public Integer getCantHoras() {
		return cantHoras;
	}
	public void setCantHoras(Integer cantHoras) {
		this.cantHoras = cantHoras;
	}
	public Integer getIdDelPiloto() {
		return idDelPiloto;
	}
	public void setIdDelPiloto(Integer idDelPiloto) {
		this.idDelPiloto = idDelPiloto;
	}
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	
	@Override
	public String toString() {
		return "Piloto [areaAsignada=" + areaAsignada + ", cantHoras=" + cantHoras + ", idDelPiloto=" + idDelPiloto
				+ ", tipoAvion=" + tipoAvion + "]";
	}
	


		
}
