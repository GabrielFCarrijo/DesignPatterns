package org.padroes.designPatterns.imposto;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

   BigDecimal calcular(Orcamento orcamento);
}
