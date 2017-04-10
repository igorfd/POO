package roteiro.listas;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TesteDataAniversario {
	@Test
	public void deveRetornarVerdadeiro(){
		DataAniversario d = new DataAniversario(12,03,96);
		DataAniversario d1 = new DataAniversario(12,03,96);
		
		assertTrue(d.equals(d1));
	}
	
	@Test
	public void deveRetornarFalso(){
		DataAniversario d = new DataAniversario(11,03,96);
		DataAniversario d1 = new DataAniversario(12,03,96);
		assertFalse(d.equals(d1));
	}
}
