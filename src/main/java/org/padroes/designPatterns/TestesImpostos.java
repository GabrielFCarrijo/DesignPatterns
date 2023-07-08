package org.padroes.designPatterns;

import org.padroes.designPatterns.imposto.CalculadoraImposto;
import org.padroes.designPatterns.imposto.TipoImposto;
import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraImposto calculadora = new CalculadoraImposto();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
    }
}
