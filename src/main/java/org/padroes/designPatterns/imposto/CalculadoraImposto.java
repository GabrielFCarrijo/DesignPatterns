package org.padroes.designPatterns.imposto;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));

            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.06"));

            default:
                return BigDecimal.ZERO;
        }

    }
}
