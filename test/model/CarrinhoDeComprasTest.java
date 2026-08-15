package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarrinhoDeComprasTest {

    @Test
    public void testCalcularTotal() {

        Produto arroz = new Produto("Arroz", 2, 10.00);
        Produto leite = new Produto("Leite", 3, 5.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(arroz);
        carrinho.adicionarProduto(leite);

        double resultado = carrinho.calcularTotal();

        assertEquals(35.00, resultado, 0.001);
    }
}