package questoes.praticas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AgendaEletronicaSet {
	private Set<ContatoSet> arvore;
	
	public AgendaEletronicaSet(Set<ContatoSet> a){
		arvore = a;
	}
	
	public void addContato(ContatoSet c){
		arvore.add(c);
	}
	
	public boolean removerContato(ContatoSet c){
		return arvore.remove(c);
	}
	
	public void removerContato(String id){
		Iterator<ContatoSet> i = arvore.iterator();
		while(i.hasNext()){
			ContatoSet temp = i.next();
			if(temp.getNome().contains(id)) i.remove();
		}
	}
	
	public List<ContatoSet> listarContatos(String id){
		List<ContatoSet> l = new ArrayList<ContatoSet> ();
		Iterator<ContatoSet> i = arvore.iterator();
		while(i.hasNext()){
			ContatoSet temp = i.next();
			if(temp.getNome().contains(id)) l.add(temp);
		}
		return l;
	}
	
	public int size(){
		return arvore.size();
	}
}
