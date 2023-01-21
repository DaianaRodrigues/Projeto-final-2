package Treino;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Interface extends JFrame{
    private JButton ligarTv, desligarTv,
            mudarCanal, ligarMudo, desligarMudo,
            aumentarVolume, baixarVolume, play,
            pause, fecharMenu;

    public Interface(){

        // Cria os botões iniciais e adiciona os eventos de clique
        ImageIcon ligar = new ImageIcon("Treino/Imagens/botao-ligar-desligar.png");
        ligar.setImage(ligar.getImage().getScaledInstance(50, 50, 100));
        ligarTv = new JButton(ligar);
        ligarTv.setBackground(Color.red);
        ligarTv.addActionListener(new OnButtonListener());
        ImageIcon desligar = new ImageIcon("Treino/Imagens/desligar.png");
        desligar.setImage(desligar.getImage().getScaledInstance(50, 50, 100));
        desligarTv = new JButton(desligar);
        desligarTv.setBackground(Color.WHITE);
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
            ImageIcon mudar = new ImageIcon("Treino/Imagens/botao-pass-track.png");
            mudar.setImage(mudar.getImage().getScaledInstance(50, 50, 100));
            mudarCanal = new JButton(mudar);
            ImageIcon liMudo = new ImageIcon("Treino/Imagens/mudo.png");
            liMudo.setImage(liMudo.getImage().getScaledInstance(50, 50, 100));
            ligarMudo = new JButton(liMudo);
            ImageIcon desMudo = new ImageIcon("Treino/Imagens/botao-de-volume.png");
            desMudo.setImage(desMudo.getImage().getScaledInstance(50, 50, 100));
            desligarMudo = new JButton(desMudo);
            ImageIcon aumeVolu = new ImageIcon("Treino/Imagens/aumentar-o-volume.png");
            aumeVolu.setImage(aumeVolu.getImage().getScaledInstance(50, 50, 100));
            aumentarVolume = new JButton(aumeVolu);
            ImageIcon baiVolu = new ImageIcon("Treino/Imagens/volume-baixo.png");
            baiVolu.setImage(baiVolu.getImage().getScaledInstance(50, 50, 100));
            baixarVolume = new JButton(baiVolu);
            ImageIcon playIma = new ImageIcon("Treino/Imagens/botao-play.png");
            playIma.setImage(playIma.getImage().getScaledInstance(50, 50, 100));
            play = new JButton(playIma);
            ImageIcon pauseIma = new ImageIcon("Treino/Imagens/botao-de-pausa-de-video.png");
            pauseIma.setImage(pauseIma.getImage().getScaledInstance(50, 50, 100));
            pause = new JButton(pauseIma);
            ImageIcon fechaMenu = new ImageIcon("Treino/Imagens/botao-excluir.png");
            fechaMenu.setImage(fechaMenu.getImage().getScaledInstance(50, 50, 100));
            fecharMenu = new JButton(fechaMenu);
            setBackground(Color.WHITE);

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

    //Dá as ações aos botões
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
            ControleRemoto cr = new ControleRemoto();
            desligarTv.addActionListener(cr.desligar());
        }
    }
}