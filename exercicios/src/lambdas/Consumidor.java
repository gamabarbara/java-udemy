package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p  -> System.out.println(p.nome + "!!!");
        Produto p1 = new Produto("Caneta", 15, 0.30);
        imprimirNome.accept(p1);
        Produto p2 = new Produto("Notebook", 4000, 0.20);
        Produto p3 = new Produto("Caderno", 20, 0.10);
        Produto p4 = new Produto("Borracha", 4, 0.05);
        Produto p5 = new Produto("Lápis", 2, 0.02);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco)); // imprime o preço do produto
        produtos.forEach(System.out::println); // imprime o nome do produto
    }
}
