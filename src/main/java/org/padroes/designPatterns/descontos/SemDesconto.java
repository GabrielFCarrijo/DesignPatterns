package org.padroes.designPatterns.descontos;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Descontos{


    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular() {
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return null;
    }
}
