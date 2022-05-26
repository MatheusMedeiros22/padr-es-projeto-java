package one.digitalinnovation.gof.facade;

import subsistema.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {


	public void migrarCliente(String name, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(name, cep, cidade, estado);
	}
}
