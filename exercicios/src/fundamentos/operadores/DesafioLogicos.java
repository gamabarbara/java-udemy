package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terca (V ou F)
        //Trabalho na quinta (V ou F)
        //Se apenas um trabalho der certo, tv 32
        // Se os dois derem certo, TV 50
        // Nos dois casos, a familia toma sorvete
        //Nenhum da certo, não toma sorvete - Fica com fome

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        //Operador Unário
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50 polegadas? " + comprouTV50);
        System.out.println("Comprou Tv 32 polegadas? " + comprouTV32);
        System.out.println("Comprou sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
