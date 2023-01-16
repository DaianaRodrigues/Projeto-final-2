package Treino2;

import Treino.ControleRemoto;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        Scanner ler = new Scanner(System.in);
        int sim = 1;
        int nao = 2;
        int resposta;

        System.out.println("Você gostaria de ligar a TV?\n1-Sim\n2-Não");
        resposta = ler.nextInt();


            if(resposta == sim){
                System.out.println("TV Ligada!");
                controleRemoto.abrirMenu();
            } else if(resposta == nao){
                System.out.println("TV desligada!");
            }

        System.out.println("Voltar ao menu?\n1-Sim\n2-Não");
        resposta = ler.nextInt();
        if(resposta == sim){
            controleRemoto.abrirMenu();
        } else{
            controleRemoto.fecharMenu();
        }
    }
}
