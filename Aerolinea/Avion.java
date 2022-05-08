package ar.edu.unlam.pb2.Aerolinea;

public class Avion{

	private Integer modeloDelAvion,hangar,cantidadDePasajeros;
	private Integer capacidadDelAvion;
	private TipoAvion tiposDeAviones;
	
	public Avion(){
		
	}
	
	public Avion(Integer modeloDelAvion2, Integer capacidadDelAvion2, TipoAvion tiposDeAviones2, Integer hangar2, Integer cantidadDeAsientosLibres) {
		this.modeloDelAvion = modeloDelAvion2;
		this.hangar = hangar2;
		this.cantidadDePasajeros = cantidadDeAsientosLibres;
		this.capacidadDelAvion = capacidadDelAvion2;
		this.tiposDeAviones = tiposDeAviones2;
	}

	public Avion crearUnAvion(Integer modeloDelAvion, Integer capacidadDelAvion, TipoAvion tiposDeAviones, Integer hangar, Integer cantidadDeAsientosLibres) {
		// TODO Auto-generated method stub
		
		Avion avionCreado = new Avion();
		avionCreado.setCantidadDePasajeros(cantidadDeAsientosLibres);
		avionCreado.setCapacidadDelAvion(capacidadDelAvion);
		avionCreado.setTiposDeAviones(tiposDeAviones);
		avionCreado.setHangar(hangar);
		avionCreado.setModeloDelAvion(modeloDelAvion);
		
		return avionCreado;
	}

	private void setTiposDeAviones(TipoAvion tiposDeAviones) {
		// TODO Auto-generated method stub
		
	}

	public Integer getModeloDelAvion() {
		return modeloDelAvion;
	}

	public void setModeloDelAvion(Integer modeloDelAvion) {
		this.modeloDelAvion = modeloDelAvion;
	}

	public Integer getHangar() {
		return hangar;
	}

	public void setHangar(Integer hangar) {
		this.hangar = hangar;
	}

	public Integer getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}

	public void setCantidadDePasajeros(Integer cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}

	public Integer getCapacidadDelAvion() {
		return capacidadDelAvion;
	}

	public void setCapacidadDelAvion(Integer capacidadDelAvion2) {
		this.capacidadDelAvion = capacidadDelAvion2;
	}

	
	public TipoAvion getTiposDeAviones() {
		return tiposDeAviones;
	}
		
	@Override
	public String toString() {
		return "Avion [modeloDelAvion=" + modeloDelAvion + ", hangar=" + hangar + ", cantidadDePasajeros="
				+ cantidadDePasajeros + ", capacidadDelAvion=" + capacidadDelAvion + ", tiposDeAviones="
				+ tiposDeAviones + "]";
	}

}
