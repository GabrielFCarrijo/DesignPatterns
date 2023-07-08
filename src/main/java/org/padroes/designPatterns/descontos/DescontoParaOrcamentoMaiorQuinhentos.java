package org.padroes.designPatterns.descontos;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorQuinhentos extends Descontos{

    public DescontoParaOrcamentoMaiorQuinhentos(Descontos proximo) {
        super(proximo);
    }
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }
}
