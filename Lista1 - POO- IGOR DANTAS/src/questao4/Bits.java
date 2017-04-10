package questao4;


public class Bits {
	private boolean [] bits;
	
	public Bits(int tam){
		bits = new boolean[tam];
	}
	
	public boolean[] getConjuntoBits() {
		return bits;
	}

	public void setConjuntoBits(boolean[] bits) {
		this.bits = bits;
	}
	
	public void alteraBit(boolean valor, int pos){
		this.bits[pos] = valor;
	}
	
	public boolean retornaBit(int pos){
		return this.bits[pos];
	}
	
	public boolean equals(Object obj){
		if (obj == null) return false;
		if(obj instanceof Bits){
			Bits b = (Bits) obj;
			if(b.toString().equals(this.toString())) return true;
		}
		return false;
	}
	
	public String toString(){
		String s = "";
		for(int i = 0; i< bits.length ; i ++){
			if(bits[i] == true) s+= "1";
			else s+="0";
		}
		return s;
	}
	
	public int size(){
		return bits.length;
	}
	
	public void and(boolean[] b) throws ParametrosDeTamanhosDiferentesException{
		if (!(b.length == this.size())) throw new ParametrosDeTamanhosDiferentesException("");
		for(int i =0; i < this.size(); i ++){
			if(this.bits[i] == true && b[i] == true) this.bits[i] = true;
			else this.bits[i] = false;
		}
	}
	
	public void or(boolean[] b) throws ParametrosDeTamanhosDiferentesException{
		if (!(b.length == this.size())) throw new ParametrosDeTamanhosDiferentesException("");
		for(int i =0; i < this.size(); i ++){
			if(this.bits[i] == true || b[i] == true) this.bits[i] = true;
			else this.bits[i] = false;
		}
	}
	public void not(){
		for(int i = 0; i < this.size(); i ++){
			if(this.bits[i] == true) this.bits[i] = false;
			else this.bits[i] = true;
		}
	}
	
}
