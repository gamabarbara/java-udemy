package fundamentos;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salário:");
        String s1 = entrada.next().replace(",", ".");
        System.out.print("Digite o segundo salário:");
        String s2 = entrada.next().replace(",", ".");
        System.out.print("Digite o terceiro salário:");
        String s3 = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(s1);
        double salario2 = Double.parseDouble(s2);
        double salario3 = Double.parseDouble(s3);

        double media = parseInt(s1 + s2 + s3) /3;
        System.out.println("A média salarial é: " + media);

        entrada.close();



    }
}
