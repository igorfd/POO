package questoes;
public class ProdutoGenerico4 <T,U> {
	private T codigo;
	private String descricao;
	private U preco;
	
	public ProdutoGenerico4(T cod, String desc, U preco){
		codigo = cod;
		descricao = desc;
		this.preco = preco;
	}
	
	public T getCodigo(){return codigo;	}
	public String getDescricao(){ return descricao; }
	public U getPreco(){ return preco; }
	
	public String toString(){
		return "ProdutoG2 {" + "codigo = " + codigo + ", descricao = " + descricao + ", preco = " + preco + "}";
	}
	public static void main(String [] args){
		Codigo2 cod = new Codigo2("Dce", 12345);
		ProdutoGenerico4<Codigo2, ValorMonetario4> produto = new ProdutoGenerico4<Codigo2, ValorMonetario4>(cod, "sei la o que djabo é", new ValorMonetario4(20.10));
		System.out.println(produto.toString());
	}
}
