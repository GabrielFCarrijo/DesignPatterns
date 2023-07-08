package org.padroes.designPatterns.descontos;

import java.math.BigDecimal;

public class SemDesconto extends Descontos{


    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular() {
        return BigDecimal.ZERO;
    }
}
