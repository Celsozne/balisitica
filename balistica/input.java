package balistica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class input extends JFrame {
    private JTextField tx_v0;
    private JTextField txteta;
    private JPanel tela;
    private JButton enviar;

    public input() {
        setContentPane(tela);
        setTitle("teste");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float v0 = Float.parseFloat(tx_v0.getText());
                float theta;
                theta = Float.parseFloat(txteta.getText());
            }
        });

    }
     void movimentoX(float theta, double v0) {
        for (double t0 = 0; t0 <= 100; t0 += 0.1) {
            double x = 0 + (v0*Math.cos(theta)*t0);
        }
    }
    void movimentoY(float theta, double v0){
        for (float t0 = 0; t0 <= 100; t0 += 0.1F) {
            float g = 9.8F;
            float y = (float) (0 + (v0* Math.sin(theta)*t0) - g*Math.pow(t0,2));
        }
    }


    public static void main(String[] args) {
        input myframe = new input();

    }
}



