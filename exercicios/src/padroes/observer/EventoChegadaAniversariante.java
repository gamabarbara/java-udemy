package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante { // Objeto que representa o evento

    private final Date momento;

    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }
// O momento já tem uma data marcada, não irá mudar. Pos isso o momento é final.

    public Date getMomento() {
        return momento;
    }
}
