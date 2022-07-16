package classe;

import java.util.Date;
import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@email.com";

        System.out.println(u1 == u2); // falso pois endereço na memória é diferente
        System.out.println(u1.equals(u2)); // mesma funcionalidade do ==
        System.out.println(u2.equals(u1));

    }
}
