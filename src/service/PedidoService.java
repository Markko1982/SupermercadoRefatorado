package service;

import model.CarrinhoDeCompras;
import model.Cliente;
import model.Pedido;

public class PedidoService {

    public Pedido criarPedido(int numeroPedido, Cliente cliente,
            CarrinhoDeCompras carrinho) {

        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(numeroPedido);
        pedido.setCliente(cliente);
        pedido.setCarrinho(carrinho);

        return pedido;
    }

    public double fecharPedido(Pedido pedido) {
        return pedido.calcularTotal();
    }
}