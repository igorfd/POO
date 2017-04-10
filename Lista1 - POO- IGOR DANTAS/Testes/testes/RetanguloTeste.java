package testes;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import questao1.Retangulo;
public class RetanguloTeste {
	
	@Test
	public void deveriamSerIguais() throws Exception{
		Retangulo r1 = new Retangulo(3,4);
		Retangulo r2 = new Retangulo(3,4);
		boolean resul = r1.equals(r2);
		assertEquals(true, resul);
	}
	
	@Test
	public void deveriamSerDiferentes()throws Exception{
		Retangulo r1 = new Retangulo(3,4);
		Retangulo r2 = new Retangulo(2,4);
		boolean resul = r1.equals(r2);
		assertEquals(false, resul);
	}
	@Test
	public void deveriaRetornarOPerimetroDoRetangulo()throws Exception{
		Retangulo r = new Retangulo(3,4);
		double per = r.perimetro();
		assertEquals(14, per, 1);
	}
	@Test
	public void deveriaRetornarAAreaDoRetangulo() throws Exception{
		Retangulo r = new Retangulo(3,4);
		double area = r.area();
		assertEquals(12, area, 1);
	}
	
}
