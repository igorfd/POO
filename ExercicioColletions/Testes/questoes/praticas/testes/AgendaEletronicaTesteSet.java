package questoes.praticas.testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import questoes.praticas.AgendaEletronicaSet;
import questoes.praticas.ContatoSet;

public class AgendaEletronicaTesteSet {
	private AgendaEletronicaSet agenda;
	private Set<ContatoSet> arvore;
	private ContatoSet c1;
	private ContatoSet c2;
	private ContatoSet c3;
	
	@Before
	public void setup(){
		arvore = new TreeSet<ContatoSet>();
		agenda = new AgendaEletronicaSet(arvore);
		c1 = new ContatoSet("igor", 12345, "igor@ufpb.br");
		c2 = new ContatoSet("samara", 12345, "samara@ufpb.br");
		c3 = new ContatoSet("igor", 12345, "igor@ufpb.br");
	}
	@Test
	public void testComparacao(){
		assertEquals(0, c1.compareTo(c3));
		assertEquals(-10, c1.compareTo(c2));
	}
	@Test
	public void testAddContato(){
		agenda.addContato(c1);//igor
		agenda.addContato(c3);//igor
		assertEquals(1, agenda.size());
		agenda.addContato(c2);//samara
		assertEquals(2, agenda.size());
	}
	@Test
	public void testRemoverVoid(){
		agenda.addContato(c1);//igor
		agenda.addContato(c2);//samara
		ContatoSet c = new ContatoSet("barbara", 12345, "babara@ufpb.br");
		agenda.addContato(c);//barbara
		agenda.removerContato("ara");
		assertEquals(1, agenda.size());
		agenda.removerContato("ir");//não remove ninguem
		assertEquals(1, agenda.size());	
	}
	@Test
	public void testListarContatos(){
		List<ContatoSet> lista = new ArrayList<ContatoSet>();
		agenda.addContato(c1);//igor
		agenda.addContato(c2);//samara
		lista = agenda.listarContatos("ig");
		assertEquals(1, lista.size());
		ContatoSet c = new ContatoSet("barbara", 12345, "babara@ufpb.br");
		agenda.addContato(c);
		lista = agenda.listarContatos("ara");
		assertEquals(2, lista.size());
		lista = agenda.listarContatos("or");
		assertEquals(1, lista.size());
	}
}
