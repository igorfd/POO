package artigotdd.calculadora.teste;
import org.junit.*;
public class PessoaTeste {
	
	@Test
	public void DeveriaCriarUmLogQuandoPessoaForExcluida() throws Exception{
		Pessoa p = new Pessoa();
		p.setNome("Igor");
		PessoaController pc = new PessoaController();
		pc.exclui(p);
	}
}
