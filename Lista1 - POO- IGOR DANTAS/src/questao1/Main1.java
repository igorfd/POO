package questao1;
public class Main1 {

	public static void main(String[] args) {
		Retangulo r1 =new Retangulo();
		r1.setAltura(3.3);
		r1.setLargura(4.2);
		Retangulo r2 = new Retangulo(5.8, 5.4);
		Retangulo r3 = new Retangulo(5.8, 5.4);
		System.out.println("Questão 1");
		System.out.println("toString: \nR1- " + r1.toString() +"\nR2- " + r2.toString());
		System.out.println("Equals: " + r1.equals(r2));
		System.out.println("Equals: " + r3.equals(r2));
		System.out.println("Perimetro de r1: " + r1.perimetro());
		System.out.println("Area de r2: " + r2.area());
	}

}
