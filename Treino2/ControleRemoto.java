
import Treino.Controlador;

import java.awt.event.ActionListener;
import java.util.Scanner;

public class ControleRemoto implements Controlador {
    Scanner ler = new Scanner(System.in);
    String resposta;
    int aumentarVolume = 3;
    int abaixarVolume = 4;
    int ligarMudo = 5;
    int desligarMudo = 6;
    int play = 7;
    int pause = 8;
    int fecharMenu = 9;
    public int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public ActionListener desligar() {

        return null;
    }

    @Override
    public ActionListener fecharMenu() {
            System.out.println("Fechando Menu...");
        return null;
    }

    @Override
    public ActionListener mudarCanal() {

        return null;
    }

    @Override
    public ActionListener maisVolume() {
            this.setVolume(this.getVolume() + 1);
            System.out.print("Volume: " + getVolume());
        return null;
    }

    public ActionListener menosVolume() {
            this.setVolume(this.getVolume() - 1);
            System.out.println("Volume: " + getVolume());
        return null;
    }

    @Override
    public ActionListener ligarMudo() {
            System.out.println("TV mutada!");
        return null;
    }

    @Override
    public ActionListener desligarMudo() {
        System.out.println("TV Desmutada!");
        return null;
    }

    @Override
    public ActionListener play() {
        System.out.println("Reproduzindo...!");
        return null;
    }

    @Override
    public ActionListener pause() {
        System.out.println("Pausado");
        return null;
    }
}
