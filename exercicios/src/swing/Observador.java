package swing;

import javax.swing.*;
import java.awt.*;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 300);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // centralizar a janela na tela do computador

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!!");
        });

        janela.setVisible(true);

    }
}
