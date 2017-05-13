package questoes.praticas;

public class ContatoMap {
	private int numero;
	private String email;
	
	public ContatoMap( int numero , String email){
		this.numero = numero;
		this.email = email;
	}
	
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj instanceof ContatoMap){
			ContatoMap temp = (ContatoMap) obj;
			if(this.numero == temp.numero && this.email.equals(temp.email)) return true;
		}
		return false;
	}
	
}
