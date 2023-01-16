package Treino;
import javax.swing.*;
import java.awt.*;
public class Tela {
    public static void main (String args[ ]) {
        int i;
        JFrame janela = new JFrame("Título da janela");
        janela.setBounds(50, 100, 400, 150); // Seta posição e tamanho
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        FlowLayout flow = new FlowLayout(); // Define o layout do container

        Container caixa = janela.getContentPane(); // Define o tamanho
        caixa.setLayout(flow); // Seta layout do container

            caixa.add(new JButton("Aperte " )); // Adiciona um botão
        janela.setVisible(true); // Exibe a janela
    }
}
