package questoes.praticas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AgendaEletronicaMap {
	public Map<String, ContatoMap> mapa;
	
	public AgendaEletronicaMap(Map<String, ContatoMap> m){
		mapa = m;
	}
	
	public void addContato(String nome, ContatoMap c){
		mapa.put(nome, c);
	}
	
	public boolean removerContato(String nome, ContatoMap c){
		return mapa.remove(nome, c);
	}
	
	public void removerContato(String id){
		Iterator i = mapa.entrySet().iterator();
		while(i.hasNext()){
			Entry<String, ContatoMap> temp = (Entry<String, ContatoMap>) i.next();
			if(temp.getKey().contains(id)) i.remove();
		}
	}
	
	public List<ContatoMap> listarContatos(String id){
		List<ContatoMap> l = new ArrayList<ContatoMap> ();
		@SuppressWarnings("rawtypes")
		Iterator i = mapa.entrySet().iterator();
		while(i.hasNext()){
			@SuppressWarnings("unchecked")
			Entry <String, ContatoMap>thisEntry = (Entry<String, ContatoMap>) i.next();		
			String n = (String) thisEntry.getKey();
			ContatoMap c = (ContatoMap) thisEntry.getValue();
			if(n.contains(id)) l.add(c);
		}
		return l;
	}
	
	public int size(){
		return mapa.size();
	}
}
