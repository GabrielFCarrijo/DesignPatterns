package org.padroes.designPatterns.descontos;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Descontos {

    protected Descontos proximo;

    public Descontos(Descontos proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}

