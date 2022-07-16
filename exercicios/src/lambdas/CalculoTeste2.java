package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calculo = (x, y) -> { return x + y;}; // Lambda
        System.out.println(calculo.executar(2, 3));

        calculo = (x, y) -> x * y; // Quando não coloca as chaves, aquilo será retornado
        System.out.println(calculo.executar(2, 3));
    }
}
