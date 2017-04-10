package questao8;

public abstract class Pessoa {
	String nome;
	Data nascimento;
	
	public Pessoa(String nome, int dia, int mes, int ano){
		this.nome = nome;
		this.nascimento = new Data(dia, mes, ano);
	}
	public abstract String imprimeDados();
	
}
