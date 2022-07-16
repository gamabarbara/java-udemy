package lambdas;

public class Produto {
    final String nome;
    public final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    public String toString() { // para imprimir o nome do produto em string
        double precoFinal = preco * (1 - desconto);
        return nome + " tem o preço de R$" + precoFinal;
    }
}
