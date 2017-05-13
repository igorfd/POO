package questoes;
public class ProdutoGenerico2<T> {
	private T codigo;
	private String descricao;
	private double preco;
	
	public ProdutoGenerico2(T cod,String descr, double pr) {
		codigo = cod;
		descricao = descr;
		preco = pr;
	}

	public T getCodigo() {	return codigo;	}
	public String getDescricao() { 	return descricao;	}
	public double getPreco() { 	return preco;	}	
	
	@Override
	public String toString() {
		return "ProdutoG{" + " codigo = " + codigo + ", descricao = " +	descricao + ", preco = " + preco + "}";
	}
	
	public static void main(String [] args){
		Codigo2 cod = new Codigo2("Dce", 12345);
		ProdutoGenerico2<Codigo2> produto = new ProdutoGenerico2<Codigo2>(cod, "sei la o que djabo é", 20.00);
		System.out.println(produto.toString());
	}
}

