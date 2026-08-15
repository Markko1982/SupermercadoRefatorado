package model;

public class Pedido {

    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private Cliente cliente;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularTotal() {
        if (carrinho == null) {
            return 0;
        }

        return carrinho.calcularTotal();
    }
}