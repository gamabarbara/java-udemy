package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        // Essa interface Supplier não recebe nenhum parâmetro e retorna alguma coisa
        Supplier<List<String>> umaLista =
                () -> Arrays.asList("Ana", "Lia", "Bia", "Gui");

        System.out.println(umaLista.get());
    }
}
