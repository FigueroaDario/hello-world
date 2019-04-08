
public class Horario {
	
	private Jornada[] horario;
	private String diadelasemana;
	
	public Horario(){
	}
	
	public Horario(String diadelasemana){
		this.diadelasemana=diadelasemana;
	}
	
	public Horario(Jornada[] horario){
		this.horario=horario;
	}
	
	public void setHorario(Jornada[] horario){
		this.horario=horario;
	}
	
	public Jornada[] getHorario(){
		return horario;
	}

	public String getDiadelasemana() {
		return diadelasemana;
	}

	public void setDiadelasemana(String diadelasemana) {
		this.diadelasemana = diadelasemana;
	}
	
	

}
