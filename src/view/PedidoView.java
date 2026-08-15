package view;

import model.Pedido;

public class PedidoView {

    public void exibirResumo(Pedido pedido, double total) {
        System.out.println("Número do pedido: " + pedido.getNumeroPedido());

        if (pedido.getCliente() != null) {
            System.out.println("Cliente: " + pedido.getCliente().getNome());
        } else {
            System.out.println("Cliente: não informado");
        }

        System.out.println("Total do pedido: " + total);
        System.out.println("=====================================");
    }
}