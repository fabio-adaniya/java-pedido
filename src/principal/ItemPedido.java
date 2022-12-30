package principal;

public class ItemPedido {
	private int id;
	private Produto produto;
	private Double quantidade;
	private Double valorTotal;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}

	public void calcularValorTotal() {
		valorTotal = quantidade * produto.getValor();
	}
}
