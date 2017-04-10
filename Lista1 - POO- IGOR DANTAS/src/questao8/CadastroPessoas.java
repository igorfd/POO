package questao8;

import java.util.ArrayList;

public class CadastroPessoas {
	private ArrayList<Pessoa> lista; 
	
	public CadastroPessoas(){
		lista = new ArrayList<Pessoa>();
	}
	public CadastroPessoas(ArrayList<Pessoa> p){
		lista = p;
	}
	
	public void cadastraPessoa(Pessoa pess){
		lista.add(pess);
	}
	
	public String imprimeCadastro(){
		String s = "CADASTRO DE PESSOAS \n\n";
		for(Pessoa p : lista){
			if(p instanceof Cliente){
				Cliente c = (Cliente) p;
				s+= c.imprimeDados() + "\n\n";
			}
			else if(p instanceof Funcionario){
				if(p instanceof Gerente){
					Gerente g = (Gerente) p;
					s += g.imprimeDados() + "\n\n";
				}
				else {
					Funcionario f = (Funcionario) p;
					s+= f.imprimeDados() + "\n\n";
				}
			}
		}
		return s;
	}
	
}
