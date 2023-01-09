import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        Scanner ler = new Scanner(System.in);
        int sim = 1;
        int nao = 2;
        String resposta;

        System.out.println("Você gostaria de ligar a TV?\n1-Sim\n2-Não");
        resposta = ler.nextLine();
        int numero = Integer.parseInt(resposta);
        if(numero == sim){
            controleRemoto.ligar();
        } else{
            System.out.println("TV desligada!");
        }
        System.out.println("O que deseja fazer?\n1-Aumentar Volume\n2-Abaixar Volume");
        resposta = ler.nextLine();
        int numero2 = Integer.parseInt(resposta);
        if(numero2 == sim){
            controleRemoto.maisVolume();
            System.out.print("Volume: " + controleRemoto.volume);

        }
    }
}
