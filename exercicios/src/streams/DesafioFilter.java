package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis", 1.99, 0.12, 10);
        Produto p2 = new Produto("Notebook", 2543, 0.15, 10);
        Produto p3 = new Produto("Caderno", 18.76,0.32, 0.12);
        Produto p4 = new Produto("Impressora", 567.92, 0.21, 10);
        Produto p5 = new Produto("Ipad", 2439.87, 0.16, 10);
        Produto p6 = new Produto("Monitor", 241.56, 0.12, 10);
        Produto p7 = new Produto("Relógio", 182.58, 0.09, 10);

        List<Produto> produtos =
                Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
        Predicate<Produto> precoRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocional =
                p -> "Aproveite! " + p.nome + " por R$" + p.preco;

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(precoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }
}
