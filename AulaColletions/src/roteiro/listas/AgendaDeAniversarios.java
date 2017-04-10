package roteiro.listas;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
	
	public void adicionarAniversariante(String nome, int dia, int mes, int ano);
	
	public ArrayList<String> obterAniversariantesDoMes(int mes);
	
	public void removerAniversariante(String nomeAniversariante);
}
