package lambdas;
@FunctionalInterface
// Reforça que há um único método na interface
// Ao usar método lambda, só pode haver um método na interface
public interface Calculo {
    public abstract double executar(double a, double b);

}
