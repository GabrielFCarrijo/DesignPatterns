package org.padroes.designPatterns;

import org.padroes.designPatterns.descontos.CalcuradoraDescontos;
import org.padroes.designPatterns.imposto.CalculadoraImposto;
import org.padroes.designPatterns.imposto.ICMS;
import org.padroes.designPatterns.imposto.ISS;
import org.padroes.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("5600"), 16);

        CalcuradoraDescontos calculadora = new CalcuradoraDescontos();
        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento2));

    }
}
