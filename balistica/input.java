package balistica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class input extends JFrame {
    private JTextField tx_v0;
    private JTextField txteta;
    private JPanel tela;
    private JButton enviar;

    public input(){
        setContentPane(tela);
        setTitle("teste");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double v0 = Double.parseDouble(tx_v0.getText());
                double teta = Double.parseDouble(txteta.getText());
            }
        });
    }

    public static void main(String[] args) {
        input myframe = new input();
    }
}
