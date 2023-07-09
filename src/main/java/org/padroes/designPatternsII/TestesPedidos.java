package org.padroes.designPatternsII;

import java.math.BigDecimal;
import java.util.Arrays;

import org.padroes.designPatternsII.pedido.GeraPedido;
import org.padroes.designPatternsII.pedido.GeraPedidoHandler;
import org.padroes.designPatternsII.pedido.acoes.CriarPedidoNoBanco;
import org.padroes.designPatternsII.pedido.acoes.EnviarPedidoPorEmail;

import static java.util.Arrays.*;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco()));
		handler.executar(gerador);
	}

}
