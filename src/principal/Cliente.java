package principal;

public class Cliente extends Pessoa {
	
	@Override
	public String informacoes() {
		return 
			"Dados do cliente\n\n" +
			"N�: " + getId() + "\n" +
			"Nome fantasia: " + getNomeFantasia() + "\n" +
			"Raz�o social: " + getRazaoSocial();
	}
}
