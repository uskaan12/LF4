package bz.berufsschule.static_methods.dreieck;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dreieck extends JFrame implements ActionListener {
    private JPanel panel1;
    private JButton berechneButton;
    private JTextField textField_SeiteA;
    private JTextField textField_SeiteB;
    private JTextField textField_SeiteC;
    private JTextField textField_HoeheC;
    private JLabel u_res;
    private JLabel f_res;

    public Dreieck() {
        berechneButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(textField_SeiteA.getText());
        int b = Integer.parseInt(textField_SeiteB.getText());
        int c = Integer.parseInt(textField_SeiteC.getText());
        int h = Integer.parseInt(textField_HoeheC.getText());

        int u = DreieckUtils.Dreieck_Umfang(a, b, c);
        int f = DreieckUtils.Dreieck_Flaeche(c, h);

        u_res.setText(u + "cm");
        f_res.setText(f + "cm²");
    }

    public static void main(String[] args) {
        Dreieck d = new Dreieck();
        d.setContentPane(d.panel1);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.pack();
        d.setVisible(true);
        d.setTitle("Das Dreieck");
    }
}
