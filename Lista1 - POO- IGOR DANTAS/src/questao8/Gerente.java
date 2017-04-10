package questao8;

public class Gerente extends Funcionario{
	private String area;
	
	public Gerente (String nome, int dia, int mes, int ano, float salario, String area){
		super(nome,dia,mes,ano,salario);
		this.area = area; 
	}
	
	public String getArea(){
		return this.area;
	}
	
	public float calculaImposto(){
		return (float) (super.salario*0.05);
	}
	
	public String imprimeDados(){
		String s = "GERENTE: " + super.nome + "\nNascimento: " +  super.nascimento + "\nArea: "+
		this.area +"\nSalário: R$" +super.salario + "\nImposto: R$" + this.calculaImposto();
		return s;
	}
	
}
