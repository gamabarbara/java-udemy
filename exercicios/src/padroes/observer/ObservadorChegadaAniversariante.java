package padroes.observer;

@FunctionalInterface
// Porque tem apenas um único método que recebe um evento como parâmetro, não é necerrário criar uma classe namorada. Podemos apenas criar uma lambda
public interface ObservadorChegadaAniversariante {
    // Essa interface será responsável por definir um método que será chamado quando o evento acontecer.
    // Todo observador precisará implementar essa interface

    public void chegou(EventoChegadaAniversariante evento);
    // Interface implementa um método abstrato
    // Quem for implementar essa interface, necessariamente precisará implementar o método chegou
    // Esse será o método chamado quando o evento acontecer

}
