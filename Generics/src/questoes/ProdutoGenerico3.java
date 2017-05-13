package questoes;
public class ProdutoGenerico3 <T> {
	private T codigo;
	private String descricao;
	private double preco;
	
	public ProdutoGenerico3(T cod, String desc, double preco){
		codigo = cod;
		descricao = desc;
		this.preco = preco;
	}
	
	public T getCodigo(){return codigo;	}
	public String getDescricao(){ return descricao; }
	public Double getPreco(){ return preco; }
	
	public String toString(){
		return "ProdutoG2 {" + "codigo = " + codigo + ", descricao = " + descricao + ", preco = " + preco + "}";
	}
	
	public static void main(String [] args){
		Codigo3<String, Integer> cod = new Codigo3<String,Integer>("Dce", 12345);
		ProdutoGenerico3<Codigo3<String, Integer>> produto = new ProdutoGenerico3<Codigo3<String, Integer>>(cod, "sei la o que djabo é", 20.00);
		System.out.println(produto.toString());
	}
}
