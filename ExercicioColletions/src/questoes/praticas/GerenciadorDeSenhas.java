package questoes.praticas;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GerenciadorDeSenhas {
	private Queue<Senha> fila;
	
	public GerenciadorDeSenhas(boolean prioridadePorIdade){
		if(prioridadePorIdade){
			fila = new PriorityQueue<Senha>();
		}
		else fila = new LinkedList<Senha>();
	}
	
	public void emitirSenha(String nome, int idade, int cpf){
		Senha s = new Senha(nome, idade, cpf);
		fila.add(s);
	}
	
	public Senha proxSenha(){
		return fila.remove();
	}
	
	
	
}
