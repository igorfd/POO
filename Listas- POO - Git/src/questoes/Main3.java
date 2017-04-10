package questoes;

import java.util.NoSuchElementException;

public class Main3 {

	public static void main(String[] args) {
		Poligono poligono = new Poligono();
		
		Ponto p1 = new Ponto(4,5);
		Ponto p2 = new Ponto(4,5);
		Ponto p3 = new Ponto(5,5);
		Ponto p4 = new Ponto(3,5);
		//Adicionando pontos
		try{
			poligono.add(p1);
		}catch(PontoJaExisteException e){
			System.out.println(e.getMessage());
		}
		try{
			poligono.add(p2);
		}catch(PontoJaExisteException e){
			System.out.println(e.getMessage());
		}
		try{
			poligono.add(p3);
		}catch(PontoJaExisteException e){
			System.out.println(e.getMessage());
		}
		try{
			poligono.add(p4);
		}catch(PontoJaExisteException e){
			System.out.println(e.getMessage());
		}
		//toString
		System.out.println("Poligono:" + poligono.toString());
		//Removendo pontos
		try {
			poligono.remove(4,5);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		try {
			poligono.remove(4,4);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Poligono:" + poligono.toString());
		
	}

}
