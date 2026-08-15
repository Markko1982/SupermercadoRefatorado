package model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.calcularTotal();
        }

        return total;
    }

    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }
}