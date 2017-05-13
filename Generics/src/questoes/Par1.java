package questoes;

public class Par1<T,I> {
	 private T objeto1;
	 private I objeto2;
	 
	 public Par1(T o1, I o2){
		 objeto1 = o1;
		 objeto2 = o2;
	 }
	 
	 public String toString(){
		 return objeto1.toString() +"  "+  objeto2.toString();
	 }
	 
	 public static void main(String [] args){
		 
	 }
}
