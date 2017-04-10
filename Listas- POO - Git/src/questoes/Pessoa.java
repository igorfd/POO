package questoes;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private char sexo;
	
	public Pessoa(){
		nome = null;
		idade = 0;
		altura = 0.0;
		peso = 0.00;
		sexo = '\u0000';
	}
	public Pessoa(String nome, int idade, double altura, double peso, char sexo){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) throws IllegalArgumentException{
		if(idade >= 0) this.idade = idade;
		else throw new IllegalArgumentException();
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) throws IllegalArgumentException{
		if(altura >= 0) this.altura = altura;
		else throw new IllegalArgumentException();
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso)throws IllegalArgumentException{
		if(peso >= 0) this.peso = peso;
		else throw new IllegalArgumentException(); 
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public double IMC(){
		return this.peso/ Math.pow(this.altura, 2);
	}
	
	public String toString(){
		if(IMC() <= 18.5){
			return "" +this.nome + " está abaixo do peso normal";
		}else if(IMC() > 18.5 && IMC() <= 25){
			return "" +this.nome + " está no seu peso normal";
		}else if(IMC() > 25 && IMC() <= 30){
			return "" +this.nome + " está acima do seu peso normal";
		}
		else{
			return "" +this.nome + " atingiu a obesidade";
		}	
	}
	
	
}
