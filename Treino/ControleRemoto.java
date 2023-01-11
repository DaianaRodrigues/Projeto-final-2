package Treino;

import java.util.Scanner;

public class ControleRemoto implements Controlador {
    Scanner ler = new Scanner(System.in);
    int resposta;
    int aumentarVolume = 1;
    int abaixarVolume = 2;
    int ligarMudo = 3;
    int desligarMudo = 4;
    int play = 5;
    int pause = 6;
    int fecharMenu = 8;
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
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1-Aumentar Volume\n2-Baixar Volume\n3-Ligar mudo\n4-Desligar Mudo\n" +
                "5-Dar play\n6-Dar pause\n7-Fechar Menu");

        resposta = ler.nextInt();
        if(resposta == aumentarVolume){
            maisVolume();
        } else if(resposta == abaixarVolume){
            menosVolume();
        } else if(resposta == ligarMudo) {
            ligarMudo();
        } else if(resposta == desligarMudo){
            desligarMudo();
        } else if(resposta == play){
            play();
        } else if(resposta == pause){
            pause();
        } else if(resposta == fecharMenu){
            fecharMenu();
        }
    }

    @Override
    public void fecharMenu() {
            System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
            this.setVolume(this.getVolume() + 1);
            System.out.print("Volume: " + getVolume());
    }

    public void menosVolume() {
            this.setVolume(this.getVolume() - 1);
            System.out.println("Volume: " + getVolume());
    }

    @Override
    public void ligarMudo() {
            System.out.println("TV mutada!");
    }

    @Override
    public void desligarMudo() {
        System.out.println("TV Desmutada!");
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo...!");
    }

    @Override
    public void pause() {
        System.out.println("Pausado");
    }
}
