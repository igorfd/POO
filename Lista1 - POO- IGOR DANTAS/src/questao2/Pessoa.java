package questao2;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected double altura;
	protected double peso;
	protected char sexo;
	
	public Pessoa(){
		nome = null;
		idade = 0;
		altura = 0;
		peso = 0;
		sexo = '\u0000';
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

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double imc(){
		return this.peso / Math.pow(altura, 2);
	}
	public String toString(){
		if(imc() <= 18.5){
			return "" +this.nome + " -Abaixo do peso normal";
		}else if(imc() > 18.5 && imc() <= 25){
			return "" +this.nome + " -Peso normal";
		}else if(imc() > 25 && imc() <= 30){
			return "" +this.nome + " -Acima do peso normal";
		}
		else{
			return "" +this.nome + " -Obesidade";
		}	
	}
}
