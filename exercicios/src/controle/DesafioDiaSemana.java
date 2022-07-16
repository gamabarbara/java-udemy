package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        //Digitar domingo, retornar 1
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia da semana: ");
        String diaDaSemana = entrada.nextLine();
        if(diaDaSemana.equals("Segunda")){
            System.out.println("Dia 1");
        } else if(diaDaSemana.equals("Terça")){
            System.out.println("Dia 2");
        } else if(diaDaSemana.equals("Quarta")){
            System.out.println("Dia 3");
        } else if(diaDaSemana.equals("Quinta")){
            System.out.println("Dia 4");
        } else if(diaDaSemana.equals("Sexta")){
            System.out.println("Dia 5");
        } else if(diaDaSemana.equals("Sábado")){
            System.out.println("Dia 6");
        } else if(diaDaSemana.equals("Domingo")){
            System.out.println("Dia 7");
        } else
            System.out.println("Dia Inválido");
        entrada.close();
    }
}
