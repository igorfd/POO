package questoes.praticas.testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import questoes.praticas.AgendaEletronicaList;
import questoes.praticas.ContatoList;

public class AgendaEletronicaTesteList {
	private AgendaEletronicaList agenda;
	private List<ContatoList> lista;
	private ContatoList c1;
	private ContatoList c2;
	private ContatoList c3;
	
	@Before
	public void setup(){
		lista = new ArrayList<ContatoList>();
		c1 = new ContatoList("igor", 12345, "igor@ufpb.br");
		c2 = new ContatoList("samara", 12345, "samara@ufpb.br");
		c3 = new ContatoList("igor", 12345, "igor@ufpb.br");
		lista.add(c1);
		agenda = new AgendaEletronicaList(lista);
	}
	
	@Test
	public void testEqualsContato(){
		assertTrue(c1.equals(c3));
		assertFalse(c1.equals(c2));
	}
	
	@Test
	public void testAddContato(){
		assertEquals(1, agenda.size());
		agenda.addContato(c3);
		assertEquals(2, agenda.size());
	}
	
	@Test
	public void testRemoverBoolean(){
		assertTrue(agenda.removerContato(c1));
		assertFalse(agenda.removerContato(c1));
		agenda.addContato(c3);
		assertTrue(agenda.removerContato(c3));
	}
	
	@Test
	public void testRemoverVoid(){
		agenda.removerContato("ig");
		assertEquals(0, agenda.size());
		agenda.addContato(c1);//igor
		agenda.addContato(c2);//samara
		agenda.removerContato("ig");
		assertEquals(1, agenda.size()); //resta samara
		ContatoList c = new ContatoList("barbara", 12345, "babara@ufpb.br");
		agenda.addContato(c);
		agenda.removerContato("ra");
		assertEquals(0, agenda.size());
	}
	
	@Test
	public void testListarContatos(){
		lista = agenda.listarContatos("ig");
		assertEquals(1, lista.size());
		agenda.addContato(c2);//samara
		agenda.addContato(c3);//igor
		ContatoList c = new ContatoList("barbara", 12345, "babara@ufpb.br");
		agenda.addContato(c);
		lista = agenda.listarContatos("ara");
		assertEquals(2, lista.size());
		lista = agenda.listarContatos("or");
		assertEquals(2, lista.size());
	}
	
}
