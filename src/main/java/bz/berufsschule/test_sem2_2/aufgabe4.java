package bz.berufsschule.test_sem2_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aufgabe4 extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField textField_A;
    private JTextField textField_B;
    private JTextField textField_U;
    private JTextField textField_F;
    private JButton berechneButton;
    private JButton resetButton;

    public aufgabe4() {
        berechneButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (textField_F.getText().isEmpty() && textField_U.getText().isEmpty()) {
            double a = Double.parseDouble(textField_A.getText());
            double b = Double.parseDouble(textField_B.getText());
            double u = Rechteck.berechneUmfang(a, b);
            double f = Rechteck.berechneFlaeche(a, b);
            textField_U.setText(String.valueOf(u));
            textField_F.setText(String.valueOf(f));
        } else if (textField_B.getText().isEmpty() && textField_F.getText().isEmpty()) {
            double a = Double.parseDouble(textField_A.getText());
            double u = Double.parseDouble(textField_U.getText());
            double b = Rechteck.berechneSeitenlaengeAusUmfang(a, u);
            double f = Rechteck.berechneFlaeche(a, b);
            textField_B.setText(String.valueOf(b));
            textField_F.setText(String.valueOf(f));
        } else if (textField_B.getText().isEmpty() && textField_U.getText().isEmpty()) {
            double a = Double.parseDouble(textField_A.getText());
            double f = Double.parseDouble(textField_F.getText());
            double b = Rechteck.berechneSeitenlaengeAusFlaeche(a, f);
            double u = Rechteck.berechneUmfang(a, b);
            textField_B.setText(String.valueOf(b));
            textField_U.setText(String.valueOf(u));
        } else if (textField_A.getText().isEmpty() && textField_F.getText().isEmpty()) {
            double b = Double.parseDouble(textField_B.getText());
            double u = Double.parseDouble(textField_U.getText());
            double a = Rechteck.berechneSeitenlaengeAusUmfang(b, u);
            double f = Rechteck.berechneFlaeche(a, b);
            textField_A.setText(String.valueOf(a));
            textField_F.setText(String.valueOf(f));
        } else if (textField_A.getText().isEmpty() && textField_U.getText().isEmpty()) {
            double b = Double.parseDouble(textField_B.getText());
            double f = Double.parseDouble(textField_F.getText());
            double a = Rechteck.berechneSeitenlaengeAusFlaeche(b, f);
            double u = Rechteck.berechneUmfang(a, b);
            textField_A.setText(String.valueOf(a));
            textField_U.setText(String.valueOf(u));
        } else {
            JOptionPane.showMessageDialog(null, "Bitte nur zwei Felder ausfüllen!", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        aufgabe4 r = new aufgabe4();
        r.setContentPane(r.panel);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Aufgabe4");
    }
}
