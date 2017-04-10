package roteiro.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MinhaAgendaDeAniversariosLinked {
private LinkedList<Aniversariante> lista;
	
	public LinkedList<Aniversariante> getLista(){
		return lista;
	}
	public MinhaAgendaDeAniversariosLinked(LinkedList<Aniversariante> a){
		lista = a;
	}
	
	public void adicionarAniversariante(String nome, int dia, int mes, int ano){
		Aniversariante a1 = new Aniversariante (nome, dia, mes, ano);
		lista.add(a1);
	}
	
	
	public LinkedList<String> obterAniversariantesDoMes(int mes){
		LinkedList<String> l = new LinkedList<String>();
		for(Aniversariante A : lista){
			if(A.ehAniversarianteDoMes(mes)) l.add(A.getNome());
		}
		return l;
	}
	
	public void removerAniversariante(String nomeAniversariante){
		Iterator<Aniversariante> i = lista.iterator();
		while(i.hasNext()){
			String n = i.next().getNome();
			if(n.equals(nomeAniversariante)) i.remove();			
		}
	}
	
}
