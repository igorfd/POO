package questoes.praticas;

public class ContatoSet implements Comparable<ContatoSet>{
	private String nome;
	private int numero;
	private String email;
	
	public ContatoSet(String nome,  int numero , String email){
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	
	public int compareTo(ContatoSet c){
		return this.nome.compareTo(c.nome);
	}
	
	public String getNome(){
		return nome;
	}

	@Override
	public String toString() {
		return "ContatoSet [nome=" + nome + ", numero=" + numero + ", email=" + email + "]";
	}
	
	
}
