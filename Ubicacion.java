
public class Ubicacion {
	
	private Double latitud, longitud;
	private String direccion_escrita;
	
	public Ubicacion(Double latitud,
			Double longitud,
			String direccion_escrita){
		this.latitud=latitud;
		this.longitud=longitud;
		this.direccion_escrita=direccion_escrita;
		}
	
	public void setLatitud(Double latitud){
		this.latitud=latitud;
	}
	public Double getLatitud(){
		return latitud;
	}
	public void setLongitud(Double longitud){
		this.longitud=longitud;
	}
	public Double getlongitud(){
		return longitud;
	}
	public void setDireccion_escrita(String direccion_escrita){
		this.direccion_escrita=direccion_escrita;
	}
	public String getDireccion_escrita(){
		return direccion_escrita;
	}
	
	
	
	
	
	
}
