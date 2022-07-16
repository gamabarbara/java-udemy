package oo.heranca;

public class Heroi extends Jogador{
    public Heroi(int x, int y) {
        super(x, y);
    }

    public Heroi() {
        super();
    }

    public boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }
}
