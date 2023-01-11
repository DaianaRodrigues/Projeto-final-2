package Treino2;

import java.util.Scanner;

public class testse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sim = 1;
        int nao = 2;
        int respota;


       try {
           System.out.println("Digite um numero: \n");
           respota = scanner.nextInt();

           if(respota == sim){
               System.out.println("Numero 1");
           }else if (respota == 2){
               System.out.println("Numero 2");
           }else{
               System.out.println("Reposta invalida!");
           }
       } catch(Exception e){
           System.out.println("Erro");
       }


    }
}
