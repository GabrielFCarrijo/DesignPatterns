package org.padroes.designPatternsII.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.realizarCalculoEspecifico(orcamento);
	}

}
