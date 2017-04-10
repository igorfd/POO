package artigotdd.calculadora.teste;

public class PessoaController {
	Pessoa p;
	Log l;
	
	public PessoaController(){
		p = new Pessoa();
		l = new Log();
	}
	
	public void exclui(Pessoa p){
		//Pessoa.exclui(p);
		l.criaLog(p.getNome());
	}
}
