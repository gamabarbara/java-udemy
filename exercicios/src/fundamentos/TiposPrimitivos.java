package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionário
        //Tipos numérios inteior
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 1_3234_845_223L;
        //Ao usar um número literal e passar o range dele, usar o L maiúsculo ao final do numéro dirá ao programa que esse é um número long;
        //Tipos numérios reais
        float salario = 11_445.44F;
        // O F indica para o java que estamos usando um literal float e não double
        double vendasAcumuladas = 2_991_797_103.01;
        // Tipo booleano
        boolean estaDeFerias = false; // true
        // Tipo caractere
        char status = 'A'; // Funcionário ativo
        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        // Número de viagens
        System.out.println(numeroDeVoos / 2);
        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
