package testes;
import org.junit.*;

import questao3.Ponto;

import static org.junit.Assert.*;
public class PontoTeste {
	@Test
	public void devemSerPontosIguais() throws Exception{
		Ponto p1 = new Ponto(2,3);
		Ponto p2 = new Ponto(2,3);
		assertEquals(true, p1.equals(p2));
	}
	@Test
	public void devemSerPontosDiferentes() throws Exception{
		Ponto p1 = new Ponto(2,3);
		Ponto p2 = new Ponto(2,4);
		assertEquals(false, p1.equals(p2));
	}
}
