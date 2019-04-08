


public class Semanario {
	
	private Horario semanario[];
	private Horario LUNES;
	private Horario MARTES;
	private Horario MIERCOLES;
	private Horario JUEVES;
	private Horario VIERNES;
	private Horario SABADO;
	private Horario DOMINGO;
	
	
	
	public Semanario(Horario[] semanario){
		this.semanario=semanario;
	}
	
	public void setSemanario(Horario[] semanario){
		this.semanario=semanario;
	}
	
	public Horario[] getSemanario(){
		return semanario;
	}
	
	
	public void Main(String[] Args){
		LUNES = new Horario("LUNES");
		MARTES = new Horario("MARTES");
		MIERCOLES = new Horario("MIERCOLES");
		JUEVES = new Horario("JUEVES");
		VIERNES = new Horario("VIERNES");
		SABADO = new Horario("SABADO");
		DOMINGO = new Horario("DOMINGO");
		
		semanario = new Horario[6];
		
		semanario[0]= this.LUNES;
		semanario[1]= this.MARTES;
		semanario[2]= this.MIERCOLES;
		semanario[3]= this.JUEVES;
		semanario[4]= this.VIERNES;
		semanario[5]= this.SABADO;
		semanario[6]= this.DOMINGO;
		
		
	}
	
	
	

}
