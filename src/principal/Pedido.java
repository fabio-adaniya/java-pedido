package principal;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	private int id;
	private Cliente cliente;
	private Vendedor vendedor;
	private Double valorTotal;
	private LocalDateTime dataHoraEmissao;
	private List<ItemPedido> itemPedido;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public LocalDateTime getDataHoraEmissao() {
		return dataHoraEmissao;
	}

	public void setDataHoraEmissao(LocalDateTime dataHoraEmissao) {
		this.dataHoraEmissao = dataHoraEmissao;
	}

	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	public void calcularValorTotal() {
		valorTotal = 0.0;
		itemPedido.forEach(itens -> valorTotal += itens.getValorTotal());
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}
}
