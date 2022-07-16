package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bárbara", 18); // Assim estamos expondo o objeto de tal forma que alguem pode trocar a idade para -30
        p1.setIdade(27); // alterar
        System.out.println(p1.getIdade()); // ler
        System.out.println(p1); //toString
    }
}
