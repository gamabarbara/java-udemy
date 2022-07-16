package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, false);
        Aluno a2 = new Aluno("Bia", 8.2, true);
        Aluno a3 = new Aluno("Gui", 6.4, true);
        Aluno a4 = new Aluno("Daniel", 7.9, false);
        Aluno a5 = new Aluno("Luna", 5.5, true);
        Aluno a6 = new Aluno("Iara", 6.7, true);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7 && a.bomComportamento;
        Function<Aluno, Boolean> bomComportamento = a -> a.bomComportamento;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + "! Você foi aprivado!";
        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
