package org.padroes.designPatterns.descontos;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeCincoItens extends Descontos{


    public DescontoParaMaisDeCincoItens(Descontos proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQntItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
