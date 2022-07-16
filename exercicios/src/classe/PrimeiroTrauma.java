package classe;

public class PrimeiroTrauma {
        int a = 3;
        static int b = 4;
    public static void main(String[] args) {
        PrimeiroTrauma p = new PrimeiroTrauma();
        System.out.println(p.a);
        // Para acessar um atributo de instancia, para acessá-lo, é necessário criar uma instância
        System.out.println(b);
        // algo estático consegue acesar algo estático. Membro de classe acessa membro de classe
    }
}
