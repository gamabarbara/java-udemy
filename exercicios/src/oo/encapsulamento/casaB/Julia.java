package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {
        Ana sogra = new Ana();
        // System.out.println(sogra.segredo); // não acessível pois é privado. Sò a classe Ana jtem acesso
        // System.out.println(sogra.facoDentroDeCasa); // não é acessivel pois não faz parte do mesmo pacote
        // System.out.println(sogra.formaDeFalar); // não é acessível pois não mora na mesma casa nem herda, pois é sogra
        System.out.println(sogra.todosSabem); // acessível pois todos sabem
    }

}
