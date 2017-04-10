package questoes;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(){
		altura = 0.0;
		largura = 0.0;
	}
	
	public Retangulo(double altura , double largura){
		this.altura = altura;
		this.largura = largura;
	}

	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj instanceof Retangulo){
			Retangulo r = (Retangulo) obj;
			if(!(r.altura == this.altura)) return false;
			else if(!(r.largura == this.largura)) return false;
			else return true;
		}
		return false;
	}
	
	public void setAltura(double alt){
		altura = alt;
	}
	public double getAltura(){
		return this.altura;
	}
	
	public void setLargura(double lar){
		largura = lar;
	}
	public double getLargura(){
		return this.largura;
	}
	
	public String toString(){
		return "Altura: "+ this.altura + "\nLargura: " + this.largura;
	}
	
	public double perimetro(){
		return (this.altura*2 + this.largura*2 );
	}
	
	public double area(){
		return this.altura * this.largura;
	}
}
