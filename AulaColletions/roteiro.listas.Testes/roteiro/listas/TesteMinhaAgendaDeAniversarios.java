package roteiro.listas;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TesteMinhaAgendaDeAniversarios {
	ArrayList<Aniversariante> l;
	MinhaAgendaDeAniversarios m;
	@Before
	public void setUp(){
		l = new ArrayList<Aniversariante>();
		m = new MinhaAgendaDeAniversarios(l);
	}
	
	@Test
	public void deveriaAdicionarAniversariante(){
		m.adicionarAniversariante("igor", 18, 03, 96);
		assertEquals(1, m.getLista().size());
	}
	
	@Test
	public void deveriaObterUmaListaComUmAniversariante(){
		m.adicionarAniversariante("igor", 18, 03, 96);
		m.adicionarAniversariante("igor", 18, 04, 96);
		assertEquals(1, m.obterAniversariantesDoMes(03).size());
	}
	
	@Test
	public void deveriaRemoverAniversariante(){
		m.adicionarAniversariante("igor", 18, 03, 96);
		m.adicionarAniversariante("igor", 18, 04, 96);
		m.removerAniversariante("igor");
		assertEquals(0, m.getLista().size());
	}
	
	
	
}
