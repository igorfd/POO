package questoes;

public class Ponto extends Poligono{
	private int x;
	private int y;
	
	public Ponto(){
		setX(0);
		setY(0);
	}
	public Ponto(int x, int y){
		 this.setX(x);
		 this.setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj instanceof Ponto){
			Ponto p = (Ponto) obj;
			if(!(p.getX() == this.x)) return false;
			if(!(p.getY() == this.y)) return false;	
		}
		return true;
	}
	public String toString(){
		return ("(" + this.x + "," + this.y + ")");
	}
}
