package testes;
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import questao3.Poligono;
import questao3.Ponto;
import questao3.PontoJaExisteException;

public class PoligonoTeste {
	@Test(expected = PontoJaExisteException.class)
	public void deveLancarExcecaoPontoJaExiste() throws PontoJaExisteException{
		Poligono pol = new Poligono();
		Ponto p1 = new Ponto(3,3);
		pol.adiciona(p1);
		Ponto p2 = new Ponto(3,3);
		pol.adiciona(p2);
	}
	
	
	@Test (expected= NoSuchElementException.class)
	public void deveLancarExcecaoNoSuchElementException() throws NoSuchElementException{
		Poligono pol = new Poligono();
		Ponto p = new Ponto(3,3);
		pol.remove(p);
	}
	
	@Test 
	public void deveCalcularAAreaDoPoligono() throws PontoJaExisteException{
		Poligono pol = new Poligono();
		pol.adiciona(5,7);
		pol.adiciona(3,4);
		assertEquals(0.5,pol.areaDoPoligono(), 1);
	}
	
	
}
