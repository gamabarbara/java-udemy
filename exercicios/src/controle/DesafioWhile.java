package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quatidadeDeNotas = 0;
        double nota = 0;
        double total = 0;
        while(nota != -1){
            System.out.println("Informe a nota (ou -1 pra sair)");
            nota = entrada.nextDouble();
            if(nota <= 10 && nota >= 0){
                total += nota;
                quatidadeDeNotas++;
            }else {
                System.out.println("Nota Inválida!");
            }
        }
        //Calcular a média
        double media = total / quatidadeDeNotas;
        System.out.println("Média = " + media);
        entrada.close();
    }
}
