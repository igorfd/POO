package testes;
import org.junit.Test;

import questao2.Pessoa;

import static org.junit.Assert.*;
public class PessoaTeste {
	@Test
	public void deveriaRetornarOIMC() throws Exception{
		Pessoa p = new Pessoa();
		p.setNome("José");
		p.setAltura(1.77);
		p.setPeso(82.0);
		double imc = p.imc();
		assertEquals(26.0, imc, 1);
	}
	@Test
	public void deveriaRetornarAbaixoDoPeso() throws Exception{
		Pessoa p = new Pessoa();
		p.setNome("José");
		p.setAltura(1.77);
		p.setPeso(56.0);
		String to = "José -Abaixo do peso normal";
		assertEquals(to, p.toString());
	}
	@Test
	public void deveriaRetornarPesoNormal() throws Exception{
		Pessoa p = new Pessoa();
		p.setNome("José");
		p.setAltura(1.77);
		p.setPeso(68.0);
		String to = "José -Peso normal";
		assertEquals(to, p.toString());
	}
	@Test
	public void deveriaRetornarAcimaDoPeso() throws Exception{
		Pessoa p = new Pessoa();
		p.setNome("José");
		p.setAltura(1.77);
		p.setPeso(82.0);
		String to = "José -Acima do peso normal";
		assertEquals(to, p.toString());
	}
	@Test
	public void deveriaRetornarObesidade() throws Exception{
		Pessoa p = new Pessoa();
		p.setNome("José");
		p.setAltura(1.77);
		p.setPeso(130.0);
		String to = "José -Obesidade";
		assertEquals(to, p.toString());
	}
}
