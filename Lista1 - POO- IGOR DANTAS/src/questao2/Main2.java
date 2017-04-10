package questao2;

public class Main2 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("José");
		p1.setAltura(1.77);
		p1.setIdade(21);
		p1.setPeso(82);
		p1.setSexo('M');
		
		p2.setNome("Maria");
		p2.setAltura(1.65);
		p2.setPeso(54);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
	

}
