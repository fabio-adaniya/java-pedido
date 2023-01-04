package principal;

public class Vendedor extends Pessoa {
	private Double comissao;

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String informacoes() {
		return
			"Dados do vendedor\n\n" +
			"Nº: " + getId() + "\n" +
			"Nome fantasia: " + getNomeFantasia() + "\n" +
			"Razão social: " + getRazaoSocial() + "\n" +
			"Comissão: " + getComissao() + "%";
	}
}
