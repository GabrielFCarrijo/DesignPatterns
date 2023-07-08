package org.padroes.designPatterns.imposto;

import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements TipoImposto{
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
