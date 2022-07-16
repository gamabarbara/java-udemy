package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    void testeAcessos() {

        //Herança só é acessível através do extends, sem precisar criar uma instância (Ana mae = new Mae())

        // System.out.println(mae.segredo); // não acessível pois é privado. Sò a classe Ana jtem acesso
        // System.out.println(mae.facoDentroDeCasa); //  não é acessivel pois não faz parte do mesmo pacote
        System.out.println(formaDeFalar); // acessível pois é herdado
        System.out.println(todosSabem); // acessível pois todos sabem
    }
}
