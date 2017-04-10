package questao9;

public class Teste {

	public static void main(String[] args) {
		FormaGeometrica r1 = new Retangulo(3, 4);
		FormaGeometrica r2 = new Retangulo(4,5);
		FormaGeometrica q1 = new Quadrado(6);
		FormaGeometrica q2 = new Quadrado(10);
		FormaGeometrica c1 = new Circulo(2);
		FormaGeometrica c2 = new Circulo(6);
		FormaGeometrica [] vetor = {r1, r2, q1, q2, c1, c2};
		
		for(int i = 0; i < vetor.length ; i++){
			System.out.println(vetor[i].toString());
		}
	}

}
