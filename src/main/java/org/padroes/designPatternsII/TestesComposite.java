package org.padroes.designPatternsII;

import org.padroes.designPatternsII.orcamento.ItemOrcamento;
import org.padroes.designPatternsII.orcamento.Orcamento;
import org.padroes.designPatternsII.orcamento.OrcamentoProxy;

import java.math.BigDecimal;


public class TestesComposite {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
	
		OrcamentoProxy proxy = new OrcamentoProxy(novo);

		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
	}

}
