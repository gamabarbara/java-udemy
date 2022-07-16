package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        // usando this como método. Só pode ser usado dentro de um construtor para chamar outro construtor
        // os dois são a mesma coisa ^^^
        //this é usado para referênciar o objeto atual
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d%", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }

    String obterData(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    // método estático não tem como usar o this pois é associado a classe e não a instância
}
