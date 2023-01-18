package Treino;
import java.util.Scanner;

public class ControleRemoto implements Controlador {
    private Scanner ler = new Scanner(System.in);
    private int sim = 1;
    private int nao = 2;
    private int resposta;
    private int aumentarVolume = 1;
    private int abaixarVolume = 2;
    private int mudarCanal = 3;
    private int ligarMudo = 4;
    private int desligarMudo = 5;
    private int play = 6;
    private int pause = 7;
    private int fecharMenu = 8;
    private int desligar = 9;
    private int volume = 50;

    @Override
    public void ligar() {
        try {
            System.out.println("Você gostaria de ligar a TV?\n1-Sim\n2-Não");
            resposta = ler.nextInt();
            if (resposta == sim) {
                System.out.println("\nTV Ligada!");
               abrirMenu();
            } else if (resposta == nao) {
                System.out.println("TV desligada!");
            } else if (resposta != sim && resposta != nao) {
                System.out.println("Opção Inválida! Digite 1-Sim ou 2-Não");
            }
            while(resposta != fecharMenu && resposta != desligar) {
                System.out.println("\nVoltar ao menu?\n1-Sim\n2-Não");
                resposta = ler.nextInt();
                if (resposta == sim) {
                    abrirMenu();
                }
            }
        } catch (Exception e) {
            System.out.println("Opção Inválida!");
        }
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV...");
    }

    @Override
    public Object abrirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1-Mudar de Canal!\n2-Aumentar Volume\n3-Abaixar Volume\n4-Ligar mudo\n" +
                "5-Desligar Mudo\n6-Dar play\n7-Dar pause\n8-Fechar Menu\n9-Desligar TV!");

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
        } else if(resposta == desligar){
            desligar();
        }
        return null;
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void mudarCanal(){
        System.out.println("Mudando de canal...");
    }

    @Override
    public void maisVolume() {
        int aumento = volume + 1;
        System.out.print("Volume: " + aumento);
    }

    public void menosVolume() {
        int abaixar = volume - 1;
        System.out.println("Volume: " + abaixar);
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
