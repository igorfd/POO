package questao9;

public class Retangulo extends Quadrilateros {
	
	
	public Retangulo(int base, int altura){
		super(base, base, altura, altura);
	}
	
	public double area() {
		return ladoA * ladoC;
	}
	public String toString(){
		 return "RETANGULO\nBase: " + ladoA + "\nAltura: " + ladoC + "\nPer�metro: " + super.perimetro() +
				 "cm" + "\n�rea: " + this.area() + "cm�\n";  
	 }
	
}
