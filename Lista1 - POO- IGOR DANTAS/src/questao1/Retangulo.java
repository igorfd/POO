package questao1;

public class Retangulo {
	protected double largura;
	protected double altura;
	
	public Retangulo(){
		largura = 0.0;
		altura = 0.0;
	}
	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	public String toString(){
		return "Largura: " + this.largura + " Altura: " + this.altura ;
	}
	
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj instanceof Retangulo){
			Retangulo r = (Retangulo) obj;
			if(r.altura == this.altura && r.largura == this.largura) return true;
		}
		return false;
	}
	public double getLargura(){
		return this.largura;
	}
	public void setLargura(double l){
		largura = l;
	}
	public double getAltura(){
		return this.altura;
	}
	public void setAltura(double a){
		altura = a;
	}
	
	public double perimetro(){
		return this.largura*2 + this.altura*2;
	}
	public double area(){
		return this.largura * this.altura;
	}
}
