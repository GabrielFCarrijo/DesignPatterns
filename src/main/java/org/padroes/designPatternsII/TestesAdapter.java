package org.padroes.designPatternsII;


import org.padroes.designPatternsII.http.ApacheHttpAdapter;
import org.padroes.designPatternsII.orcamento.ItemOrcamento;
import org.padroes.designPatternsII.orcamento.Orcamento;
import org.padroes.designPatternsII.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);
	}

}
