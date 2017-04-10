package roteiro.listas;

public class Aniversariante {
	private String nome;
	private DataAniversario data;
	
	public Aniversariante(String nome, int dia, int mes, int ano){
		this.setNome(nome);
		setData(new DataAniversario(dia, mes, ano));
	}

	public DataAniversario getData() {
		return data;
	}

	public void setData(DataAniversario data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean ehAniversarianteDoMes(int mes){
		return this.data.getMes() == mes;
	}
	
}
