package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante { // classe observer. Interessada em ser notificado pelo subject quando o evento ocorrer

    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados!");
        System.out.println("Apagar as luzer!");
        System.out.println("Esperar um pouco!");
        System.out.println("Surpresa!!!");

    }
}
