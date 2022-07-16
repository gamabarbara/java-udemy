package classe;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = ""; // Essa variável é totalmente válida, mesmo sendo uma string vazia
        System.out.println(s1.concat("!!!!"));

//        String s2; Váriaveis locais precisam ser inicializadas. Aqui o código não é compilado
//        System.out.println(s2.concat("!!!"));

        Data d1 = null;
        if(d1 != null){
            System.out.println("Não é nulo");
        }

        String s2 = null; // Agora o código é compilado normalmente. Porém aponta um erro de execução
        if(s2 != null){
            System.out.println(s2.concat("!!!!"));
        }
    }
}
