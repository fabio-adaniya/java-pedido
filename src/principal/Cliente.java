package principal;

public class Cliente extends Pessoa {
	
	@Override
	public String informacoes() {
		return 
			"Dados do cliente\n\n" +
			"Nº: " + getId() + "\n" +
			"Nome fantasia: " + getNomeFantasia() + "\n" +
			"Razão social: " + getRazaoSocial();
	}
}
