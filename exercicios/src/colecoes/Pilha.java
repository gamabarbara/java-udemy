package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O pequeno príncipe"); // retorna booleano
        livros.push("Don Quixote"); // não retorna nada.

        System.out.println(livros.peek()); // retorna o ultimo adicionado a pilha
        System.out.println(livros.element());

        System.out.println(livros.poll()); // retorna o item e já o remove
        System.out.println(livros.pop()); // retira o ultimo elemento da pilha
//        livros.size(); // tamanho
//        livros.clear(); // limpa a fila
//        livros.contains(); // faz uma busca
//        livros.isEmpty() // verifica se a fila está vazia

        for(String livro: livros) {
            System.out.println(livro);
        }


    }
}
