package org.padroes.designPatternsII.pedido.acoes;

import org.padroes.designPatternsII.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados...");
	}

}
