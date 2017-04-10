package questoes;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Poligono {
	private ArrayList<Ponto> pol = new ArrayList<Ponto> ();
	
	public void add(Ponto p) throws PontoJaExisteException {
		for(Ponto i: pol){
			if(i.equals(p)){
				throw new PontoJaExisteException("Ponto já existe");
			}
		}
		pol.add(p);
	}
	public void remove(Ponto p) throws NoSuchElementException{
		boolean existe = false;
		for(Ponto i: pol){
			if(i.equals(p)){
				existe = true;
			}
		}
		if(existe) pol.remove(p);
		else throw new NoSuchElementException("Ponto " + p.toString() + " não existe");
	}
	public void remove(int x, int y) throws NoSuchElementException{
		Ponto p = new Ponto(x,y);
		boolean existe = false;
		for(Ponto i: pol){
			if((i.equals(p))){
				existe = true;
			}
		}
		if (existe) pol.remove(p);
		else throw new NoSuchElementException("Ponto " + p.toString() + " não existe");
	}
	
	public ArrayList<Ponto> getPoligono(){
		return this.pol;
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Poligono p = (Poligono) obj;
		if (!this.pol.equals(p.pol))
			return false;
		return true;
	}
	
	public String toString(){
		String s = "";
		for(Ponto i: pol){
			s += "" + i.toString();
		}
		return s;
	}
	
	
}
