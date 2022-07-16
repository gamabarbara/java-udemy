package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        //O java não permite a conversão de inteiro primitivo para um valor double do tipo clase.

        BinaryOperator<Double> calculo = (x, y) -> { return x + y;}; // Lambda
        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (x, y) -> x * y; // Quando não coloca as chaves, aquilo será retornado
        System.out.println(calculo.apply(2.0, 3.0));

        BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y;};
        System.out.println(calculo2.apply(2, 3));

        calculo = (x, y) -> x * y;
        System.out.println(calculo2.apply(2, 3));
    }
}
