package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá mundo!".charAt(2));
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        //String é um objeto imutável
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(s.startsWith("BOA"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde!"));
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome
                + " Idade: " + idade + "\nSalário: " + salario + "\n\n";

        System.out.printf("Nome: O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        String frase = String.format("\nNome: O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println(("Frase qualquer".substring(6)));
        System.out.println(("Frase qualquer".substring(6, 10)));
    }
}
