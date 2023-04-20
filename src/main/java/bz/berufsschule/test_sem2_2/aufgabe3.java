package bz.berufsschule.test_sem2_2;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aufgabe3 extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField MorF;
    private JTextField gewicht;
    private JTextField alk_procent;
    private JTextField liter;
    private JButton OKButton;
    private JLabel promille;

    public aufgabe3() {
        OKButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if gettext fails it will print out an error message
        if (MorF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bitte geben Sie das Geschlecht an", "Fehler", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (gewicht.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bitte geben Sie das Gewicht an", "Fehler", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (alk_procent.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bitte geben Sie das Alkoholgehalt an", "Fehler", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (this.liter.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bitte geben Sie das Liter an", "Fehler", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String gender = MorF.getText();
        double reduction;
        if (gender.equalsIgnoreCase("M")) {
            reduction = 0.7;
        } else {
            reduction = 0.6;
        }
        double weight = Integer.parseInt(gewicht.getText());
        double alcohol = Double.parseDouble(alk_procent.getText());
        double liter = Double.parseDouble(this.liter.getText());
        double mass_alk = 10 * alcohol * liter * 0.8;
        double result = mass_alk / (weight * reduction);
        promille.setText("Promille: " + result);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        aufgabe3 r = new aufgabe3();
        r.setContentPane(r.panel);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Aufgabe3");
    }
}
