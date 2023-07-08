package org.padroes.designPatterns.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int qntItens;

    public Orcamento(BigDecimal valor, int qntItens) {
        this.valor = valor;
        this.qntItens = qntItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQntItens() {
        return qntItens;
    }

    public void setQntItens(int qntItens) {
        this.qntItens = qntItens;
    }
}
