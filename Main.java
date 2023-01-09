public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldSwing");
        final JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.ligar();
        controleRemoto.maisVolume();
        controleRemoto.play();
        controleRemoto.abrirMenu();
        controleRemoto.fecharMenu();

    }
}
