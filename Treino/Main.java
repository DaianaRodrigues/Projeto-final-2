package Treino;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        Scanner ler = new Scanner(System.in);
        int sim = 1;
        int resposta;

        try {
            System.out.println("Você gostaria de ligar a TV?\n1-Sim\n2-Não");
            resposta = ler.nextInt();
            if(resposta == sim){
                System.out.println("TV Ligada!");
                controleRemoto.abrirMenu();
            } else{
                System.out.println("TV desligada!");
            }
            System.out.println("\nVoltar ao menu?\n1-Sim\n2-Não");
            resposta = ler.nextInt();
            if(resposta == sim){
                controleRemoto.abrirMenu();
            } else{
                controleRemoto.fecharMenu();
            }
        } catch(Exception e){
            System.out.println("Opção Invalida!");
        }


    }
}
