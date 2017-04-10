package questoes;

import java.util.Arrays;

import questao4.ParametrosDeTamanhosDiferentesException;

public class Questao4 {
	private boolean bits[];
	private boolean bit;
	
	public Questao4(int tam){
		bits = new  boolean[tam];
		setBit(false);
	}

	public boolean getBit() {
		return bit;
	}

	public void setBit(boolean bit) {
		this.bit = bit;
	}
	public String toString(){
		String s = "";
		for (boolean i: bits){
			if(i == true){
				s+= "1";
			}else s+= "0";
		}
		return s;
	}
	public boolean equals(Object obj){
		if(obj == null) 
			return false;
		if(obj instanceof Questao4){
			Questao4 q = (Questao4) obj;
			if(!Arrays.equals(bits, q.bits)) 
				return false;
			else return true;
		}
		return false;
	}
	public boolean[] getBits(){
		return this.bits;
	}
	public Questao4 AND(boolean[] a, boolean[] b) throws ParametrosDeTamanhosDiferentesException{
		if(a.length != b.length) throw new ParametrosDeTamanhosDiferentesException("");
		Questao4 c = new Questao4(a.length);
		for(int i =0; i< a.length; i++){
			if(a[i] == true && b[i] == true) c.bits[i] = true;
			else c.bits[i] = false;
		}
		return c;
	}
	public Questao4 OR(boolean[] a, boolean[] b) throws ParametrosDeTamanhosDiferentesException{
		if(a.length != b.length) throw new ParametrosDeTamanhosDiferentesException("");
		Questao4 c = new Questao4(a.length);
		for(int i =0; i< a.length; i++){
			if(a[i] == true || b[i] == true) c.bits[i] = true;
			else c.bits[i] = false;
		}
		return c;
	}
	public Questao4 NOT(Questao4 a){
		for(int i =0; i< a.bits.length; i ++){
			if(a.bits[i] == true) a.bits[i] = false;
			else a.bits[i] = true;
		}
		return a;
	}

	
	
	
	
	
	
	
}
