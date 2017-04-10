package questao3;

public class Ponto {
	protected int x;
	protected int y;
	
	public Ponto(){
		x = 0;
		y = 0;
	}
	public Ponto(int X, int Y){
		x = X;
		y = Y;
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
			if(p.x == this.x && p.y == this.y) return true;
		}
		return false;
	}
	public String toString(){
		return "(" + this.x + "," + this.y +")";
	}
	
	
}
