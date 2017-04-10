package testes;

import org.junit.Test;

import questao4.Bits;
import questao4.ParametrosDeTamanhosDiferentesException;

import static org.junit.Assert.*;

public class BitsTeste {
	
	@Test(expected = ParametrosDeTamanhosDiferentesException.class)
	public void deveriaLancarParametrosDeTamanhosDiferentes() throws ParametrosDeTamanhosDiferentesException{
		Bits b = new Bits(3);
		boolean [] a1 = {false,false, true};
		b.setConjuntoBits(a1);
		boolean [] a2 = {false,true, true, false};
		b.and(a2);
		
		Bits teste = new Bits(3);
		boolean [] esperado = {false, false, true};
		teste.setConjuntoBits(esperado);
		assertEquals(teste.toString(), b.toString());
	}
	@Test
	public void deveriaAlterarBit() throws Exception{
		Bits b = new Bits(3);
		boolean [] a1 = {false,false, true};
		b.setConjuntoBits(a1);
		b.alteraBit(true, 0);
		assertEquals(true ,b.getConjuntoBits()[0]);
	}
	
	@Test
	public void deveriaRetornarBit() throws Exception{
		Bits b = new Bits(3);
		boolean [] a1 = {false,false, true};
		b.setConjuntoBits(a1);
		boolean teste = b.retornaBit(1);
		assertEquals(false , teste);
	}
	@Test
	public void deveriaFazerOperacaoAND() throws ParametrosDeTamanhosDiferentesException{
		Bits b = new Bits(3);
		boolean [] a1 = {false,false, true};
		b.setConjuntoBits(a1);
		boolean [] a2 = {false,true, true};
		b.and(a2);
		
		Bits teste = new Bits(3);
		boolean [] esperado = {false, false, true};
		teste.setConjuntoBits(esperado);
		assertEquals(teste.toString(), b.toString());
	}
	@Test
	public void deveriaFazerOperacaoOR() throws ParametrosDeTamanhosDiferentesException{
		Bits b = new Bits(3);
		boolean [] a1 = {false,false, true};
		b.setConjuntoBits(a1);
		boolean [] a2 = {false,true, true};
		b.or(a2);
		
		Bits teste = new Bits(3);
		boolean [] esperado = {false, true, true};
		teste.setConjuntoBits(esperado);
		assertEquals(teste.toString(), b.toString());
	}
	@Test
	public void deveriaFazerAOperacaoNot(){
		Bits b = new Bits(3);
		boolean [] a = {true, false, true};
		b.setConjuntoBits(a);
		b.not();
		
		Bits teste = new Bits(3);
		boolean [] esperado = {false, true, false};
		teste.setConjuntoBits(esperado);
		
		assertEquals(teste.toString(), b.toString());
		
	}
	
}
