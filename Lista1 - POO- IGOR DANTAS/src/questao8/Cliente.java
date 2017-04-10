package questao8;

public class Cliente extends Pessoa{
	private int codigo;
	
	public Cliente(String nome, int dia, int mes, int ano, int codigo){
		super(nome,dia,mes,ano);
		this.codigo = codigo;
	}
	
	public String imprimeDados() {
		String s = "CLIENTE: "+ super.nome + "\nNascimento: " +  super.nascimento + "\nCódigo: " + getCodigo();
		return s;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
}
