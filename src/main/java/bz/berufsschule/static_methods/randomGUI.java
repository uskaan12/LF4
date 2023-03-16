package bz.berufsschule.static_methods;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class randomGUI {
    private JPanel Box;
    private JButton randomButton;
    private JLabel Ausgabe;


    public static void main(String[] args) {
        JFrame frame = new JFrame("RandomGUI");
        frame.setContentPane(new randomGUI().Box);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(200, 200);
    }



    public randomGUI() {
        randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zufallszahl = (int) (Math.random() * 6+1);
                Ausgabe.setText(String.valueOf(zufallszahl));
            }
        });
    }
}