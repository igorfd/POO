package questoes;

public class Codigo2 {
	private String setor;
	private int cod;
	
	public Codigo2(String setor, int cod){
		this.setor = "" + setor.toUpperCase().charAt(0) + setor.toUpperCase().charAt(1) + setor.toUpperCase().charAt(2); //outro jeito de fazer isso?
		this.cod = cod;
	}
	
	public String toString(){
		return this.setor + this.cod;
	}	
}
