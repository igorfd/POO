package questao8;

public class Funcionario extends Pessoa {
	protected float salario;
	
	public Funcionario(String nome, int dia, int mes, int ano, float salario){
		super(nome,dia,mes,ano); 
		this.salario = salario;
	}
	public float calculaImposto(){
		return (float) (salario*0.03);
	}
	public String imprimeDados(){
		String s=  "FUNCIONÁRIO: "+  super.nome + "\nNascimento: " +  super.nascimento + "\nSalário: R$" +
		this.salario + "\nImposto: R$" + this.calculaImposto();
		return s;
	}
	
}
