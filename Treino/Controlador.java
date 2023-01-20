package Treino;

import java.awt.event.ActionListener;

public interface Controlador {
     ActionListener desligar();
     ActionListener fecharMenu();
     ActionListener mudarCanal();
     ActionListener maisVolume();
     ActionListener menosVolume();
     ActionListener ligarMudo();
     ActionListener desligarMudo();
     ActionListener play();
     ActionListener pause();
}
