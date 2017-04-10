package artigotdd.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void deveriaSomarDoisNumeros() throws Exception{
		int A = 1;
		int B = 2;
		int soma = 0;
		Calculadora c = new Calculadora();
		soma = c.soma(A , B);
		assertEquals(3,soma);
	}
	@Test
	public void deveriaSubtrairDoisNumeros() throws Exception{
		int A = 1;
		int B = 3;
		int subtrai;
		Calculadora c = new Calculadora();
		subtrai = c.subtrai(A, B);
		assertEquals(-2, subtrai);
	}
	@Test
	public void deveriaDividir() throws Exception{
		int A = 6;
		int B = 3;
		Calculadora c = new Calculadora();
		int divisao = c.divisao(A, B);
		assertEquals(2, divisao);
	}
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarExcecaoDivisaoPorZero() throws Exception{
		int A = 3;
		int B = 0;
		Calculadora c = new Calculadora();
		c.divisao(A, B);
	}
	
	
}
