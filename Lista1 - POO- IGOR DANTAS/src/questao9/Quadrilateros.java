package questao9;

public abstract class Quadrilateros implements FormaGeometrica {
	protected int ladoA;
	protected int ladoB;
	protected int ladoC;
	protected int ladoD;
	
	public Quadrilateros(int lado1, int lado2, int lado3, int lado4){
		ladoA = lado1;
		ladoB = lado2;
		ladoC = lado3;
		ladoD = lado4;
	}
	
	public double perimetro(){
		return ladoA + ladoB + ladoC+ ladoD;
	}
}
