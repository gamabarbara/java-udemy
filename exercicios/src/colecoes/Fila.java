package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e add -> Adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // Retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Eelement -> obter o próximo elemento da fila (sem remover)
        // Diferença ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        //Pool e Remove -> obter o próximo elemendo da fila e o remove!
        // Diferenã ocorre quando a fila está vazia

        System.out.println(fila.poll()); // retorna o elemento da fila já o removendo
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // QUE CONFUSÃO!!!!!!!!!


    }
}
