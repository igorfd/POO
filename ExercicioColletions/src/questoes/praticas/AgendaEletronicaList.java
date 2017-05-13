package questoes.praticas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronicaList {
	List<ContatoList> lista;
	
	public AgendaEletronicaList(List<ContatoList> l) {	lista = l; }
	
	public void addContato(ContatoList c){ lista.add(c); }
	
	public boolean removerContato(ContatoList c){
/*		Iterator<ContatoList> i = lista.iterator();
		while(i.hasNext()){
			if(i.next().equals(c)){
				i.remove();
				return true;
			}
		}
		return false;
*/	
		return lista.remove(c);
	}
	
	public void removerContato(String id){
		Iterator<ContatoList> i = lista.iterator();
		while(i.hasNext()){
			ContatoList temp = i.next();
			if(temp.getNome().contains(id)) i.remove(); 
		}
	}
	
	public List<ContatoList> listarContatos(String id){
		List<ContatoList> l = new ArrayList<ContatoList>();
		for(ContatoList c: lista){
			if(c.getNome().contains(id)) l.add(c);
		}
		return l;
	}
	
	public int size(){
		return lista.size();
	}

}
