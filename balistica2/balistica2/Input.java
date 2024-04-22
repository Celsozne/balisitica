package balistica2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input {
    private JPanel panel1;
    private JLabel velocidade;
    private JTextField velinput;
    private JLabel angulo;
    private JTextField anginput;
    private JButton calcular;

    public Input() {
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
