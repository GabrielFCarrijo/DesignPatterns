package org.padroes.designPatternsII;

import org.padroes.designPatterns.imposto.ISS;
import org.padroes.designPatternsII.imposto.ICMS;
import org.padroes.designPatternsII.imposto.Imposto;
import org.padroes.designPatternsII.orcamento.ItemOrcamento;
import org.padroes.designPatternsII.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));
	}

}
