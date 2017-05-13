package questoes.praticas;

public class ContatoList {
	private String nome;
	private int numero;
	private String email;
	
	public ContatoList(String nome,  int numero , String email){
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	
	public boolean equals(Object obj){
		if (obj == null) return false;
		if(obj instanceof ContatoList){
			ContatoList temp = (ContatoList) obj;
			if((temp.nome.equalsIgnoreCase(this.nome)) && temp.numero == this.numero &&
					temp.email.equalsIgnoreCase(this.email)) return true;
		}
		return false;
	}
	public String getNome(){
		return nome;
	}

	@Override
	public String toString() {
		return "ContatoList [nome=" + nome + ", numero=" + numero + ", email=" + email + "]";
	}
	
	
}
