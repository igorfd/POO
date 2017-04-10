package questao4;

public class Main4 {
	public static void main(String[] args){
		Bits q = new Bits(4);
		boolean []array1 = {true, false, true, true}; //1011
		boolean []array2 = {true, true, true, false}; //1110
		boolean []array3 = {false, false,false, true}; //0001
		q.setConjuntoBits(array1);
		System.out.println("Array de bits: " + q.toString());
		System.out.println("AND");
		try{
			//1011 AND 1110 = 1010
			q.and(array2);	
		}catch(ParametrosDeTamanhosDiferentesException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Novo array de bits: " + q.toString());
		System.out.println("OR:");
		//OR
		try{
			//1010 OR 0001 = 1011
			q.or(array3);
		}catch(ParametrosDeTamanhosDiferentesException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Novo array de bits: " + q.toString());
		//NOT = 0100
		System.out.println("NOT:");
		q.not();
		System.out.println("Novo array de bits: " + q.toString());	
		
		System.out.println("Retorna terceiro bit: " + q.retornaBit(2));
		System.out.println("Alterando terceiro bit para 1");
		q.alteraBit(true, 2);
		System.out.println("Retorna terceiro bit: " + q.retornaBit(2));
		
	}

}
