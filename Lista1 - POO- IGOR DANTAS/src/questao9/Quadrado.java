package questao9;

public class Quadrado extends Quadrilateros{
	public Quadrado(int lado){
		super(lado, lado, lado, lado);
	}
	public double area(){
		return ladoA*ladoA;
	}
	public String toString(){
		 return "QUADRADO\nTamanho dos lados: " + ladoA + "\nPerímetro: " + super.perimetro() +
				 "cm" + "\nÁrea: " + this.area() + "cm²\n";  
	 }
}
