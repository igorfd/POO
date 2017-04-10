package questao8;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int DD, int MM,int AA){
		dia = DD;
		mes = MM;
		ano = AA;
	}
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	
	public String toString(){
		return getDia() + "/" + getMes() + "/" + getAno();
	}
}
