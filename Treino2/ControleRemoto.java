package Treino2;

import Treino.Controlador;

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
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("3-Aumentar Volume\n4-baixar Volume\n5-Ligar mudo\n6-Desligar Mudo\n" +
                "7-Dar play\n8-Dar pause\n9-Fechar Menu");

        resposta = ler.nextLine();
        int resposta2 = Integer.parseInt(resposta);
        if(resposta2 == aumentarVolume){
            maisVolume();
        } else if(resposta2 == abaixarVolume){
            menosVolume();
        } else if(resposta2 == ligarMudo) {
            ligarMudo();
        } else if(resposta2 == desligarMudo){
            desligarMudo();
        } else if(resposta2 == play){
            play();
        } else if(resposta2 == pause){
            pause();
        } else if(resposta2 == fecharMenu){
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
