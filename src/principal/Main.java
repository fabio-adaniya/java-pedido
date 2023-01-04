package principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNomeFantasia("cliente 1");
		cliente.setRazaoSocial("cliente razao social 1");
		
		Vendedor vendedor = new Vendedor();
		vendedor.setId(1);
		vendedor.setNomeFantasia("vendedor 1");
		vendedor.setRazaoSocial("vendedor razao social 1");
		vendedor.setComissao(7.5);
		
		Produto produto = new Produto();
		produto.setId(1);
		produto.setCodigo("produto 1");
		produto.setDescricao("descricao 1");
		produto.setValor(10.0);
		
		Produto produto2 = new Produto();
		produto2.setId(1);
		produto2.setCodigo("produto 2");
		produto2.setDescricao("descricao 2");
		produto2.setValor(5.0);
		
		ItemPedido itemPedido = new ItemPedido();
		itemPedido.setId(1);
		itemPedido.setProduto(produto);
		itemPedido.setQuantidade(2.0);
		itemPedido.calcularValorTotal();
		
		ItemPedido itemPedido2 = new ItemPedido();
		itemPedido2.setId(2);
		itemPedido2.setProduto(produto2);
		itemPedido2.setQuantidade(7.0);
		itemPedido2.calcularValorTotal();
		
		Pedido pedido = new Pedido();
		pedido.setId(1);
		pedido.setDataHoraEmissao(LocalDateTime.now());
		pedido.setCliente(cliente);
		pedido.setVendedor(vendedor);
		
		ArrayList<ItemPedido> listaItens = new ArrayList<ItemPedido>();
		listaItens.add(itemPedido);
		listaItens.add(itemPedido2);
		
		pedido.setItemPedido(listaItens);
		pedido.calcularValorTotal();
		
		DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println("Pedido Nº " + pedido.getId());
		System.out.println("");
		System.out.println("Data de emissão: " + pedido.getDataHoraEmissao().format(data));
		System.out.println("Hora de emissão: " + pedido.getDataHoraEmissao().format(hora)); 
		System.out.println("Valor total: " + pedido.getValorTotal());
		System.out.println("=====================================");
		System.out.println(pedido.getCliente().informacoes());
		System.out.println("=====================================");
		System.out.println(pedido.getVendedor().informacoes());
		System.out.println("=====================================");
		System.out.println("Itens do pedido");
		System.out.println("");
		
		pedido.getItemPedido().
			forEach(
				itens -> System.out.println(
					"Nº: " + itens.getId() + "\n" + 
					"Código do produto: " + itens.getProduto().getCodigo() + "\n" +
					"Descrição do produto: " + itens.getProduto().getDescricao() + "\n" +
					"Quantidade: " + itens.getQuantidade() + "\n" +
					"Valor unitário: " + itens.getProduto().getValor() + "\n" +
					"Valor total: " + itens.getValorTotal() + "\n" + 
					"-------------------------------------"));
	}
}
