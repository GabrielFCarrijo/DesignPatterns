package org.padroes.designPatternsII.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import org.padroes.designPatternsII.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
