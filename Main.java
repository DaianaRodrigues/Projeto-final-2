import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControleRemot controleRemoto = new ControleRemot();
        Scanner ler = new Scanner(System.in);
        int sim = 1;
        int nao = 2;
        String resposta;

        System.out.println("Você gostaria de ligar a TV?\n1-Sim\n2-Não");
        resposta = ler.nextLine();
        int numero = Integer.parseInt(resposta);
        if(numero == sim){
            System.out.println("TV Ligada!");
            controleRemoto.abrirMenu();
        } else if(numero == nao){
            System.out.println("TV desligada!");
        }
    }
}
