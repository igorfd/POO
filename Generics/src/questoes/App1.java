package questoes;

public class App1 {

	public static void main(String[] args) {
		Par1<String, Double> par1 = new Par1<String, Double>("Igor", 2.0);
		Par1<Integer,String> par2 = new Par1<Integer,String>(223421, "José");
		Par1<Double, Double> par3 = new Par1<Double, Double>(2.0, 2.0);
		Par1<String, Integer> par4 = new Par1<String, Integer>("Igor", 21);
		Par1<String, String> par5 = new Par1<String, String>("Samara", "Estudante");
		System.out.println(par1.toString());
		System.out.println(par2.toString());
		System.out.println(par3.toString());
		System.out.println(par4.toString());
		System.out.println(par5.toString());
		}

}
