package questoes;
public class Codigo3<T,I> {
	private T setor;
	private I cod;
	
	public Codigo3(T setor, I cod){
		this.setor =  setor;
		this.cod = cod;
	}
	
	public String toString(){
		return this.setor.toString() + this.cod.toString();
	}
}
