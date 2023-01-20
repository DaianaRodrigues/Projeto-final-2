package Treino;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ControleRemoto implements Controlador {
    private int volume = 50;

    @Override
    public ActionListener desligar() {
        JOptionPane.showMessageDialog(null,"Desligando TV...");
        return null;
    }

    @Override
    public ActionListener fecharMenu() {
        JOptionPane.showMessageDialog(null,"Fechando Menu...");
        return null;
    }

    @Override
    public ActionListener mudarCanal(){
        JOptionPane.showMessageDialog(null,"Mudando de canal...");//E vai adicionando as mensagens
       return null;
    }

    @Override
    public ActionListener maisVolume() {
        int aumento = volume + 1;
        JOptionPane.showMessageDialog(null,"Volume: " + aumento);
        return null;
    }

    public ActionListener menosVolume() {
        int abaixar = volume - 1;
        JOptionPane.showMessageDialog(null,"Volume: " + abaixar);
        return null;
    }

    @Override
    public ActionListener ligarMudo() {
        JOptionPane.showMessageDialog(null,"TV mutada!");
        return null;
    }

    @Override
    public ActionListener desligarMudo() {
        JOptionPane.showMessageDialog(null,"TV Desmutada!");
        return null;
    }

    @Override
    public ActionListener play() {
        JOptionPane.showMessageDialog(null,"Reproduzindo...!");
        return null;
    }

    @Override
    public ActionListener pause() {
        JOptionPane.showMessageDialog(null,"Pausado");
        return null;
    }
}
