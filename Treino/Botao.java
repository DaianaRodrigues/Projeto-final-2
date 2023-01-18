package Treino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Botao extends JFrame{
    private JButton ligarTv = new JButton("Ligar TV");
    private JButton desligarTv = new JButton("Desligar TV");
    private JButton ligarMudo = new JButton("Ligar Mudo");
    private JButton desligarMudo = new JButton("Desligar mudo");
    private JButton mudarCanal = new JButton("Mudar canal");
    private JButton aumentarVolume = new JButton("Aumentar volume");
    private JButton abaixarVolume = new JButton("Abaixar volume");
    private JButton fecharMenu = new JButton("Fechar Menu");
    private JButton play = new JButton("Play");
    private JButton pause = new JButton("Pause");
    private BotaoAcao acao;

    public Botao(){
        super("Criando botões");
        setLayout(new FlowLayout());
        acao = new BotaoAcao(ligarTv, desligarTv, ligarMudo);
        acao = new BotaoAcao(desligarMudo, mudarCanal, aumentarVolume);
        acao = new BotaoAcao(abaixarVolume, fecharMenu, play);

        ligarTv.addActionListener(acao);
        add(ligarTv);

        desligarTv.addActionListener(acao);
        add(desligarTv);

        ligarMudo.addActionListener(acao);
        add(ligarMudo);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getLigarMudo() {
        return ligarMudo;
    }

    public void setLigarMudo(JButton ligarMudo) {
        this.ligarMudo = ligarMudo;
    }


}
