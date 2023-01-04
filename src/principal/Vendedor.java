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
			"N�: " + getId() + "\n" +
			"Nome fantasia: " + getNomeFantasia() + "\n" +
			"Raz�o social: " + getRazaoSocial() + "\n" +
			"Comiss�o: " + getComissao() + "%";
	}
}
