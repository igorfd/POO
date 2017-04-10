package questao3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Poligono {
	private ArrayList<Ponto> pol = new ArrayList<Ponto>();
	
	public void adiciona(Ponto p) throws PontoJaExisteException{
		if(this.pol.contains(p)) throw new PontoJaExisteException("");
		pol.add(p);
	}
	public void adiciona(int x, int y) throws PontoJaExisteException{
		Ponto p = new Ponto(x, y);
		if(this.pol.contains(p)) throw new PontoJaExisteException("");
		pol.add(p);
	}
	
	public void remove(Ponto p) throws NoSuchElementException{
		if(!this.pol.contains(p))throw new NoSuchElementException("") ;
		pol.remove(p);
	}
	
	public void remove(int x, int y) throws NoSuchElementException{
		Ponto p = new Ponto(x,y);
		if(!this.pol.contains(p))throw new NoSuchElementException("") ;
		pol.remove(p);
	}
	
	public boolean contains(Ponto p){
		for(Ponto i : this.pol){
			if(p.equals(i)) return true;
		}
		return false;
	}
	
	public double areaDoPoligono(){
		double soma = 0;
		for(int k = 0; k < pol.size() -1 ; k ++){
			soma += pol.get(k+1).getY()* pol.get(k).getX() - pol.get(k+1).getX()*pol.get(k).getY();
		}
		return soma/2;
	}
	
}
