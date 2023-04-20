package bz.berufsschule.static_methods;

import bz.berufsschule.static_methods.currency.pruefziffer;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kreis extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField textFieldUmfang;
    private JTextField textFieldRadius;
    private JTextField textFieldFlaeche;
    private JButton berechneButton;

    public kreis() {
        berechneButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double umfang = Double.parseDouble(textFieldUmfang.getText());
        double radius = Double.parseDouble(textFieldRadius.getText());
        double flaeche = Double.parseDouble(textFieldFlaeche.getText());
        if (umfang == 0) {
            umfang = bz.berufsschule.utils.Kreis.berechneUmfang(radius);
            textFieldUmfang.setText(String.valueOf(umfang));
        } if (radius == 0) {
            radius = bz.berufsschule.utils.Kreis.berechneRadiusAusUmfang(umfang);
            textFieldRadius.setText(String.valueOf(radius));
        } if (flaeche == 0) {
            flaeche = bz.berufsschule.utils.Kreis.berechneFlaeche(radius);
            textFieldFlaeche.setText(String.valueOf(flaeche));
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        kreis r = new kreis();
        r.setContentPane(r.panel);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Kreis");
    }
}
