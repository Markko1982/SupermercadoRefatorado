package supermercadorefatorado;

import model.CarrinhoDeCompras;
import model.Cliente;
import model.Pedido;
import model.Produto;
import service.PedidoService;
import view.PedidoView;

public class SupermercadoRefatorado {

    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 1, 3.99);
        Produto frango = new Produto("Filé de frango sassami", 2, 21.99);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(arroz);
        carrinho.adicionarProduto(frango);

        Cliente cliente = new Cliente(
                "Marcus Diego Souza",
                "123.456.789-00",
                "marcus@email.com"
        );

        PedidoService pedidoService = new PedidoService();

        Pedido pedido = pedidoService.criarPedido(
                1,
                cliente,
                carrinho
        );

        double total = pedidoService.fecharPedido(pedido);

       PedidoView pedidoView = new PedidoView();
       pedidoView.exibirResumo(pedido, total);
    }
}