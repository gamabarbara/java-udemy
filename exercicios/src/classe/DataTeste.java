package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();
        data.ano = 2021;
        var data2 = new Data(17, 01, 1995);



        System.out.println("Eu me casei no dia " + data.dia + " do mês " + data.mes + " do ano de " + data.ano);
        System.out.println(data.obterData());
        System.out.println(data2.obterData());


    }
}
