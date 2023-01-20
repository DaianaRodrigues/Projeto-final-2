package Treino;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interface extends JFrame{
    private JButton ligarTv, desligarTv;
    private JButton mudarCanal, ligarMudo, desligarMudo, aumentarVolume, baixarVolume, play, pause, fecharMenu;

    public Interface(){
        // Cria os botões iniciais e adiciona os eventos de clique
        ligarTv = new JButton("Ligar TV");
        ligarTv.setBackground(Color.red);
        ImageIcon icon = new ImageIcon("botao-ligar-desligar.png");
        JLabel label = new JLabel(icon);
        ligarTv.setIcon(label.getIcon());
        ligarTv.addActionListener(new OnButtonListener());

        desligarTv = new JButton("Desligar TV");
        desligarTv.addActionListener(new OffButtonListener());

        // Adiciona os botões iniciais à interface
        add(ligarTv);
        add(desligarTv);

        // Configura a janela
        FlowLayout layout = new FlowLayout();
        setSize(500, 300);
        setTitle("Controle Remoto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(layout);
        setVisible(true);
    }
    private class OnButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Remove os botões iniciais
            remove(ligarTv);
            remove(desligarTv);
            //Cria os novos botões
            mudarCanal = new JButton("Mudar de canal");
            ligarMudo = new JButton("Ligar Mudo");
            desligarMudo = new JButton("Desligar mudo");
            aumentarVolume = new JButton("Aumentar volume");
            baixarVolume = new JButton("Baixar volume");
            play = new JButton("Play");
            pause = new JButton("Pause");
            fecharMenu = new JButton("Fechar Menu");

        // Adiciona os novos botões à interface
            add(mudarCanal);
            mudarCanal.addActionListener(new mudarCanal());
            add(ligarMudo);
            ligarMudo.addActionListener(new ligarMudo());
            add(desligarMudo);
            desligarMudo.addActionListener(new desligarMudo());
            add(aumentarVolume);
            aumentarVolume.addActionListener(new aumentar());
            add(baixarVolume);
            baixarVolume.addActionListener(new abaixar());
            add(play);
            play.addActionListener(new play());
            add(pause);
            pause.addActionListener(new pause());
            add(fecharMenu);
            fecharMenu.addActionListener(new fechar());
            //Atualiza a tela
            revalidate();
            repaint();
        }
    }

    private class mudarCanal implements ActionListener {
        public void actionPerformed(ActionEvent e){
            ControleRemoto cr = new ControleRemoto();
            mudarCanal.addActionListener(cr.mudarCanal());
        }
    }
    private class ligarMudo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ControleRemoto cr = new ControleRemoto();
            ligarMudo.addActionListener(cr.ligarMudo());
        }
    }
    private class desligarMudo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ControleRemoto cr = new ControleRemoto();
            desligarMudo.addActionListener(cr.desligarMudo());
        }
    }
    private class aumentar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ControleRemoto cr = new ControleRemoto();
            aumentarVolume.addActionListener(cr.maisVolume());
        }
    }
    private class abaixar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ControleRemoto cr = new ControleRemoto();
            baixarVolume.addActionListener(cr.menosVolume());
        }
    }
    private class play implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ControleRemoto cr = new ControleRemoto();
            play.addActionListener(cr.play());
        }
    }
    private class pause implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ControleRemoto cr = new ControleRemoto();
            pause.addActionListener(cr.pause());
        }
    }
    private class fechar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ControleRemoto cr = new ControleRemoto();
            fecharMenu.addActionListener(cr.fecharMenu());
        }
    }
    private class OffButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Adicionar ação do botão Desligar aqui
            ControleRemoto cr = new ControleRemoto();
            desligarTv.addActionListener(cr.desligar());
        }
    }
}