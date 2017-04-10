package questao8;

public class testaCadastro {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("José",  14,10,1996,  000341);
		Cliente cliente2 = new Cliente("Renata", 23,06,1986,  000342);
		Cliente cliente3 = new Cliente("André", 03,02,1979,  000343);
		
		Funcionario funcionario1 = new Funcionario("Fernanda" ,  12,05,93,  937);
		Funcionario funcionario2 = new Funcionario("João Lucas" ,  18,03,96,  937);
		Funcionario funcionario3 = new Funcionario("Carla" ,  12,11,92,  962);
		
		Gerente gerente1 = new Gerente ("Paula", 03,07,73, 1800, "RH");
		Gerente gerente2 = new Gerente ("Adriana", 19,06,82, 1650, "Vendas");
		Gerente gerente3 = new Gerente ("Carlos", 12,12,87, 2000 , "Projetos");
		CadastroPessoas cadastro = new CadastroPessoas();
		cadastro.cadastraPessoa(cliente1);
		cadastro.cadastraPessoa(cliente2);
		cadastro.cadastraPessoa(cliente3);

		cadastro.cadastraPessoa(funcionario1);
		cadastro.cadastraPessoa(funcionario2);
		cadastro.cadastraPessoa(funcionario3);
		
		cadastro.cadastraPessoa(gerente1);
		cadastro.cadastraPessoa(gerente2);
		cadastro.cadastraPessoa(gerente3);
		System.out.println(cadastro.imprimeCadastro());
		
		
	}

}
