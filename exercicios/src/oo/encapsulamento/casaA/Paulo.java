package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();
    void testeAcessos() {
        // System.out.println(esposa.segredo); // não acessível pois é privado. Sò a classe Ana jtem acesso
        System.out.println(esposa.facoDentroDeCasa); // acessivel pois faz parte do mesmo pacote
        System.out.println(esposa.formaDeFalar); // acessóvel pois mora na mesma casa
        System.out.println(esposa.todosSabem); // acessível pois todos sabem
    }
}
