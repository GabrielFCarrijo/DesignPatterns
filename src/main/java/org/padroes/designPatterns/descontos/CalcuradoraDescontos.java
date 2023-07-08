package org.padroes.designPatterns.descontos;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcuradoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Descontos desconto =
                new DescontoParaMaisDeCincoItens(
                new DescontoParaOrcamentoMaiorQuinhentos(
                new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
