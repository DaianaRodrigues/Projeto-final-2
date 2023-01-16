package Treino2;

import javax.swing.JButton;
import java.awt.*;
import java.text.ParseException;
import java.text.ParseException;
import javax.swing.*;
public class Console{



        public static void main(String[] args) {
            final JPanel jPanel = new JPanel();

            final JPanel gridButton = new JPanel(new GridLayout(0,2,3,3));

            gridButton.add(new JButton("Ligar"));
            gridButton.add(new JButton("Menu"));
            gridButton.add(new JButton("Ligar Mudo"));
            gridButton.add(new JButton("Desligar Mudo"));
            gridButton.add(new JButton("Abaixar Volume"));
            gridButton.add(new JButton("Aumentar Volume"));
            gridButton.add(new JButton("Play"));
            gridButton.add(new JButton("Pause"));
            gridButton.add(new JButton("Fechar Menu"));
            gridButton.add(new JButton("Desligar"));






         jPanel.add(gridButton);


            JOptionPane.showMessageDialog(null, jPanel);
        }
    }


