import java.time.*;


public class Jornada {
	
	private Clock abierto, cerrado;
	
	public Jornada(Clock abierto, Clock cerrado){
		this.abierto=abierto;
		this.cerrado=cerrado;
	}
	
	public void setAbierto(Clock abierto){
		this.abierto=abierto;
	}
	public Clock getAbierto(){
		return abierto;
	}
	
	public void setCerrado(Clock abierto){
		this.abierto=cerrado;
	}
	public Clock getCerrado(){
		return cerrado;
	}
	
}
