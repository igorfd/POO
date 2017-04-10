package roteiro.listas;

import java.util.ArrayList;
import java.util.Iterator;


public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	private ArrayList<Aniversariante> lista;
	
	public ArrayList<Aniversariante> getLista(){
		return lista;
	}
	public MinhaAgendaDeAniversarios(ArrayList<Aniversariante> a){
		lista = a;
	}
	
	public void adicionarAniversariante(String nome, int dia, int mes, int ano){
		Aniversariante a1 = new Aniversariante (nome, dia, mes, ano);
		lista.add(a1);
	}
	
	
	public ArrayList<String> obterAniversariantesDoMes(int mes){
		ArrayList<String> l = new ArrayList<String>();
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
