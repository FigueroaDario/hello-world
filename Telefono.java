
public class Telefono {
	
	private String tipo_telefono;
	private int telefono;
	
	
	public Telefono(String tipo_telefono, int telefono){
		this.telefono=telefono;
		this.tipo_telefono=tipo_telefono;
	}
	
	public void setTipo_telefono(String tipo_telefono){
		this.tipo_telefono=tipo_telefono;
	}
	
	public String getTipo_telefono(){
		return tipo_telefono;
	}
	
	public void setTelefono(int telefono){
		this.telefono=telefono;
	}
	
	public int getTelefono(){
		return telefono;
	}
}
