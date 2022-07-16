package arrays;

import java.util.Arrays;

public class ExercicioForEach {
    public static void main(String[] args) {


    double[] notasAlunoA = new double[3];
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;
        System.out.println(Arrays.toString(notasAlunoA));
        for(double nota: notasAlunoA){
            System.out.println(nota + " ");
        }

        double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        for(double nota: notasAlunoB){
            System.out.println(nota + " ");
        }
    }
}
