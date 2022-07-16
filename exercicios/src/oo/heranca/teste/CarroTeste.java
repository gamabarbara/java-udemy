package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        int velocidadeMaxima = 0;
        Carro c1 = new Carro(velocidadeMaxima);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.ligarAr();
        c2.desligarAr();

        System.out.println(c2.velocidadeDoAr());

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

    }
// ESTÁ PRESO EM 0KM E EU NÃO FAÇO IDEIA DO PORQUE!!!!!

}
