package questao9;

public class Circulo implements FormaGeometrica{
	private int raio;
	private final double pi;
	
	public Circulo(int raio){
		this.raio = raio;
		pi = 3.14;
	}
	public double perimetro() {
		return raio*pi*2;
	}

	public double area() {
		return pi* Math.pow(raio, 2);
	}
	public String toString(){
		return "CIRCULO\nRaio: " + this.raio + "\nPerímetro:" + this.perimetro() + "\nÁrea: " + this.area() + "\n";
	}
	
}
