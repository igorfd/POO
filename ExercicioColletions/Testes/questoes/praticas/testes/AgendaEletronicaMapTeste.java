package questoes.praticas.testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import questoes.praticas.AgendaEletronicaMap;
import questoes.praticas.ContatoMap;

public class AgendaEletronicaMapTeste {
	private AgendaEletronicaMap agenda;
	private Map<String,ContatoMap> mapa;
	private ContatoMap c1;
	private ContatoMap c2;
	private ContatoMap c3;
	
	@Before
	public void setup(){
		mapa = new HashMap<String, ContatoMap>();
		agenda = new AgendaEletronicaMap(mapa);
		c1 = new ContatoMap(12345, "igor@ufpb.br");
		c2 = new ContatoMap(12345, "samara@ufpb.br");
		c3 = new ContatoMap(12345, "igor@ufpb.br");
	}
	@Test
	public void addContato(){
		agenda.addContato("igor", c1);
		agenda.addContato("samara", c2);
		assertEquals(2, agenda.size());
		agenda.addContato("igor", c3);//substitui o outro valor com a chave 'igor'
		assertEquals(2, agenda.size());
	}
	@Test
	public void testRemoverContatoVoid(){
		agenda.addContato("igor", c1);
		agenda.addContato("samara", c2);
		agenda.removerContato("ig");
		assertEquals(1, agenda.size());
		ContatoMap c = new ContatoMap( 12345, "babara@ufpb.br");
		agenda.addContato("barbara", c);
		agenda.removerContato("ara");
		assertEquals(0, agenda.size());
	}
	@Test
	public void testListarContatos(){
		List<ContatoMap> lista = new ArrayList<ContatoMap>();
		agenda.addContato("igor", c1);
		agenda.addContato("samara", c2);
		lista = agenda.listarContatos("ig");
		assertEquals(1, lista.size());
		ContatoMap c = new ContatoMap(12345, "babara@ufpb.br");
		agenda.addContato("barbara", c);
		lista = agenda.listarContatos("ara");
		assertEquals(2, lista.size());
		lista = agenda.listarContatos("r");
		assertEquals(3, lista.size());
	}
}
