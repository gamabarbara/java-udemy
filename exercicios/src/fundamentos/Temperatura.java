package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (°F - 32) * (5/9) = °C
        final int AJUSTE = 32;
        final double FATOR = 5.0/9;
        double fahreinheit = 86;
        double celsius = (fahreinheit - AJUSTE) * FATOR;
        System.out.println("O resultado é: " + celsius + "°C");
    }
}
