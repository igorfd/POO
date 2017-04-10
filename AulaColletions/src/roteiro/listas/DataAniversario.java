package roteiro.listas;

public class DataAniversario {
	private int dia;
	private int mes;
	private int ano;
	
	public DataAniversario(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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
	
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj instanceof DataAniversario){
			DataAniversario temp = (DataAniversario) obj;
			if(temp.dia == this.dia && temp.mes == this.mes && temp.ano == this.ano) return true;
		}
		return false;
	}
}
