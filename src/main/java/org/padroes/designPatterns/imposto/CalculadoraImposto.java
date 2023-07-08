package org.padroes.designPatterns.imposto;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

        return tipoImposto.calcular(orcamento);
    }
}
