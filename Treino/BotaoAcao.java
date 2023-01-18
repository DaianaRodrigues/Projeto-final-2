package Treino;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BotaoAcao implements ActionListener {
    ControleRemoto cr = new ControleRemoto();
    Botao botao = new Botao();
    private JButton ligarTv, desligarTv, ligarMudo, abaixarVolume;

    public BotaoAcao(JButton ligarTv, JButton desligarTv, JButton ligarMudo, JButton abaixarVolume){
        this.ligarTv = ligarTv;
        this.desligarTv = desligarTv;
        this.ligarMudo = ligarMudo;
        this.abaixarVolume = abaixarVolume;
    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == ligarTv){
            JOptionPane.showMessageDialog(null, cr.abrirMenu());
        }
        if(evento.getSource() == desligarTv)
            JOptionPane.showMessageDialog(null, "O botão CANCELA foi clicado");
    }
}
