package org.padroes.designPatternsII.pedido.acoes;

import org.padroes.designPatternsII.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente sobre pedido...");
	}

}
