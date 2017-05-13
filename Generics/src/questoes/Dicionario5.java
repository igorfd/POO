package questoes;

import java.util.ArrayList;
import java.util.List;

public class Dicionario5 <K, V>{
	private List<K> lk;
	private List<V> lv;
	
	public Dicionario5(){
		lk = new ArrayList<K>();
		lv = new ArrayList<V>();
	}
	
	public void add(K chave, V valor){
		lk.add(chave);
		lv.add(valor);
	}
	
	public V get(K chave){
		int c = 0;
		for(K key: lk){
			c++; 
			if(key.equals(chave)){
				return lv.get(c);
			}
		}
		return null;
	}
	
	
}
