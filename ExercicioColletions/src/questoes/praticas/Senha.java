package questoes.praticas;

public class Senha implements Comparable<Senha>{
	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private int cpf;
	private int idade;
	
	public Senha(String nome, int idade, int cpf){
		assert(idade > 0  && idade < 120 && cpf > 0);
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public int compareTo(Senha s){
		if(this.idade < s.idade) return -1;
		else return 1;
	}
}
