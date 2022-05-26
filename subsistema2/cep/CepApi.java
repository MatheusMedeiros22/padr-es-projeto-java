package subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia = new CepApi();

	private CepApi() { //construtor privado garante que ngm instancie a classe fora dela
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Recife";
	}
	
	public String recuperarEstado(String cep) {
		return "Pernambuco";
	}
}
