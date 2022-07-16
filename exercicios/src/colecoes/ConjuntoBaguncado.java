package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // converte de double pra Double
        conjunto.add(true); // converte de boolean pra Boolean
        conjunto.add("Teste");
        conjunto.add(1); // converte de int pra Integer
        conjunto.add("x"); // converte de char pra Char

        System.out.println("Tamanho é: " + conjunto.size());
        conjunto.add("teste");
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains("x"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums);  União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
