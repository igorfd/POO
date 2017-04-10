package roteiro.listas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAniversariante {
	
	@Test
	public void deveRetornarVerdadeiro(){
		Aniversariante a1 = new Aniversariante("igor", 18,03,96);
		assertTrue(a1.ehAniversarianteDoMes(03));
	}
	
	@Test
	public void deveRetornarFalso(){
		Aniversariante a1 = new Aniversariante("igor", 18,04,96);
		assertTrue(a1.ehAniversarianteDoMes(03));
	}
}
